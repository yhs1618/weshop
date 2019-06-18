package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.GoodsApi;
import tech.wetech.weshop.dto.GoodsCategoryDTO;
import tech.wetech.weshop.dto.GoodsDetailDTO;
import tech.wetech.weshop.dto.GoodsListDTO;
import tech.wetech.weshop.dto.GoodsResultDTO;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.Goods;
import tech.wetech.weshop.query.GoodsSearchQuery;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@Component
public class GoodsApiFallback extends ApiFallback<Goods> implements GoodsApi {
    @Override
    public Result<List<Goods>> queryListByCategoryIdIn(List<Integer> categoryIdList) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<GoodsResultDTO> queryList(GoodsSearchQuery goodsSearchQuery) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<GoodsDetailDTO> queryGoodsDetail(Integer goodsId) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<List<GoodsListDTO>> queryRelatedGoods(Integer goodsId) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<GoodsCategoryDTO> queryGoodsCategory(Integer categoryId) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
