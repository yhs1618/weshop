package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.FootprintApi;
import tech.wetech.weshop.bo.GoodsFootprintBO;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.Footprint;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@Component
public class FootprintApiFallback extends ApiFallback<Footprint> implements FootprintApi {
    @Override
    public Result<List<List<GoodsFootprintBO>>> queryGoodsFootprintTimeLine() {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
