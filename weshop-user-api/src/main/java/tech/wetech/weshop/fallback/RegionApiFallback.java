package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.RegionApi;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.Region;
import tech.wetech.weshop.utils.Result;

@Component
public class RegionApiFallback extends ApiFallback<Region> implements RegionApi {
    @Override
    public Result<String> queryNameById(Short id) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
