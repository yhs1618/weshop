package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.AddressApi;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.dto.AddressDTO;
import tech.wetech.weshop.po.Address;
import tech.wetech.weshop.service.AddressService;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController extends BaseApi<Address> implements AddressApi {

    @Autowired
    private AddressService addressService;

    @Override
    public Result<AddressDTO> queryDetail(Integer id) {
        return Result.success(addressService.queryDetail(id));
    }

    @Override
    public Result<List<AddressDTO>> queryDetailList() {
        return Result.success(addressService.queryDetailList());
    }
}
