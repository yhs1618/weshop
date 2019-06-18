package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.GoodsApi;
import tech.wetech.weshop.dto.GoodsCategoryDTO;
import tech.wetech.weshop.dto.GoodsDetailDTO;
import tech.wetech.weshop.dto.GoodsListDTO;
import tech.wetech.weshop.dto.GoodsResultDTO;
import tech.wetech.weshop.po.Goods;
import tech.wetech.weshop.query.GoodsSearchQuery;
import tech.wetech.weshop.service.GoodsService;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController extends BaseApi<Goods> implements GoodsApi {

    @Autowired
    private GoodsService goodsService;

    @Override
    public Result<List<Goods>> queryListByCategoryIdIn(List<Integer> categoryIdList) {
        return Result.success(goodsService.queryListByCategoryIdIn(categoryIdList));
    }

    @Override
    public Result<GoodsResultDTO> queryList(GoodsSearchQuery goodsSearchQuery) {
        return Result.success(goodsService.queryList(goodsSearchQuery));
    }

    @Override
    public Result<GoodsDetailDTO> queryGoodsDetail(Integer goodsId) {
        return Result.success(goodsService.queryGoodsDetail(goodsId));
    }

    @Override
    public Result<List<GoodsListDTO>> queryRelatedGoods(Integer goodsId) {
        return Result.success(goodsService.queryRelatedGoods(goodsId));
    }

    @Override
    public Result<GoodsCategoryDTO> queryGoodsCategory(Integer categoryId) {
        return Result.success(goodsService.queryGoodsCategory(categoryId));
    }
}
