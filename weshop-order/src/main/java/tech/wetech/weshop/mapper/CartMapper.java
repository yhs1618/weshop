package tech.wetech.weshop.mapper;

import tech.wetech.weshop.po.Cart;
import tech.wetech.weshop.utils.MyMapper;

public interface CartMapper extends MyMapper<Cart> {

    int incrementNumberById(Integer id);

}