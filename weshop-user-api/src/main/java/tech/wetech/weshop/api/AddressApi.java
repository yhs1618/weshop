package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tech.wetech.weshop.dto.AddressDTO;
import tech.wetech.weshop.fallback.AddressApiFallback;
import tech.wetech.weshop.po.Address;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@FeignClient(value = "weshop-user", path = "address", fallback = AddressApiFallback.class)
public interface AddressApi extends Api<Address> {

    @GetMapping("/queryDetail")
    Result<AddressDTO> queryDetail(Integer id);

    @GetMapping("/queryDetailList")
    Result<List<AddressDTO>> queryDetailList();
}
