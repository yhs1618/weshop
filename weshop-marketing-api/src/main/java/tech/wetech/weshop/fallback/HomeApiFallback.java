package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.HomeApi;
import tech.wetech.weshop.dto.HomeIndexDTO;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.utils.Result;

@Component
public class HomeApiFallback implements HomeApi {
    @Override
    public Result<HomeIndexDTO> index() {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
