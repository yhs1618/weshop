package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.GoodsSpecificationApi;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.GoodsSpecification;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@Component
public class GoodsSpecificationApiFallback extends ApiFallback<GoodsSpecification> implements GoodsSpecificationApi {
    @Override
    public Result<List<String>> queryValueByGoodsIdAndIdIn(Integer goodsId, List<Integer> goodsSpecificationIds) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
