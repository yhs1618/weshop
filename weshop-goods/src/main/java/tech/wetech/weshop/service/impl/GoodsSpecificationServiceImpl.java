package tech.wetech.weshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.wetech.weshop.mapper.GoodsSpecificationMapper;
import tech.wetech.weshop.po.GoodsSpecification;
import tech.wetech.weshop.service.BaseService;
import tech.wetech.weshop.service.GoodsSpecificationService;

import java.util.List;

@Service
public class GoodsSpecificationServiceImpl extends BaseService<GoodsSpecification> implements GoodsSpecificationService {

    @Autowired
    private GoodsSpecificationMapper goodsSpecificationMapper;

    @Override
    public List<String> queryValueByGoodsIdAndIdIn(Integer goodsId, List<Integer> goodsSpecificationIds) {
        return goodsSpecificationMapper.selectValueByGoodsIdAndIdIn(goodsId, goodsSpecificationIds);
    }
}
