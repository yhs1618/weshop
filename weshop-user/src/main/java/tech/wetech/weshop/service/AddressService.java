package tech.wetech.weshop.service;

import tech.wetech.weshop.dto.AddressDTO;
import tech.wetech.weshop.po.Address;

import java.util.List;

/**
 * @author cjbi@outlook.com
 */
public interface AddressService extends IService<Address> {

    AddressDTO queryDetail(Integer id);

    List<AddressDTO> queryDetailList();

}
