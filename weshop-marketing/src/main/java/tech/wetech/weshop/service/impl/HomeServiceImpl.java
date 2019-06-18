package tech.wetech.weshop.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tech.wetech.weshop.api.BrandApi;
import tech.wetech.weshop.api.CategoryApi;
import tech.wetech.weshop.api.ChannelApi;
import tech.wetech.weshop.api.GoodsApi;
import tech.wetech.weshop.dto.HomeCategoryDTO;
import tech.wetech.weshop.dto.HomeIndexDTO;
import tech.wetech.weshop.mapper.AdMapper;
import tech.wetech.weshop.mapper.TopicMapper;
import tech.wetech.weshop.po.*;
import tech.wetech.weshop.query.PageQuery;
import tech.wetech.weshop.query.PageQueryWrapper;
import tech.wetech.weshop.service.HomeService;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private AdMapper adMapper;

    @Autowired
    private ChannelApi channelApi;

    @Autowired
    private GoodsApi goodsApi;

    @Autowired
    private BrandApi brandApi;

    @Autowired
    private TopicMapper topicMapper;

    @Autowired
    private CategoryApi categoryApi;

    @Override
    @Cacheable("index")
    public HomeIndexDTO index() {

        List<Ad> bannerList = adMapper.select(new Ad().setAdPositionId((short) 1));

        PageHelper.orderBy("sort_order asc");
        List<Channel> channelList = channelApi.queryAll().getData();

        List<Goods> newGoodsList = goodsApi.queryPageList(new PageQueryWrapper<Goods>(new PageQuery(1, 4), new Goods().setNewly(true))).getData();

        PageHelper.startPage(1, 4);
        List<Goods> hotGoodsList = goodsApi.queryPageList(new PageQueryWrapper<Goods>(new PageQuery(1, 4), new Goods().setHot(true))).getData();

        PageHelper.orderBy("new_sort_order asc");
        List<Brand> brandList = brandApi.queryList(new Brand().setNewly(true)).getData();

        PageHelper.startPage(1, 3);
        List<Topic> topicList = topicMapper.selectAll();

        List<HomeCategoryDTO> categoryList = new LinkedList<>();

        categoryApi.queryList(
                new Category().setParentId(0)
        ).getData().forEach(c -> {

            List<Integer> categoryIdList = categoryApi.queryList(new Category().setParentId(c.getId())).getData().stream()
                    .map(Category::getId)
                    .collect(Collectors.toList());

            List<Goods> goodsList = goodsApi.queryListByCategoryIdIn(categoryIdList).getData();
            categoryList.add(new HomeCategoryDTO(c.getId(), c.getName(), goodsList));
        });

        return new HomeIndexDTO().setBannerList(bannerList)
                .setChannelList(channelList)
                .setNewGoodsList(newGoodsList)
                .setHotGoodsList(hotGoodsList)
                .setBrandList(brandList)
                .setTopicList(topicList)
                .setCategoryList(categoryList);
    }

}
