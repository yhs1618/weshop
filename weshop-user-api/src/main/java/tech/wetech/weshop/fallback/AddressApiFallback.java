package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.AddressApi;
import tech.wetech.weshop.dto.AddressDTO;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.Address;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@Component
public class AddressApiFallback extends ApiFallback<Address> implements AddressApi {

    @Override
    public Result<AddressDTO> queryDetail(Integer id) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<List<AddressDTO>> queryDetailList() {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
