package tech.wetech.weshop.service;

import tech.wetech.weshop.dto.CartCheckoutDTO;
import tech.wetech.weshop.dto.CartParamDTO;
import tech.wetech.weshop.dto.CartResultDTO;
import tech.wetech.weshop.po.Cart;

public interface CartService extends IService<Cart> {

    CartResultDTO getCart();

    void addGoodsToCart(CartParamDTO cartParamDTO);

    void updateGoods(CartParamDTO cartParamDTO);

    CartCheckoutDTO checkoutCart(Integer addressId, Integer couponId);

}
