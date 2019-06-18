package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.CartApi;
import tech.wetech.weshop.dto.CartCheckoutDTO;
import tech.wetech.weshop.dto.CartParamDTO;
import tech.wetech.weshop.dto.CartResultDTO;
import tech.wetech.weshop.po.Cart;
import tech.wetech.weshop.service.CartService;
import tech.wetech.weshop.utils.Result;

@RequestMapping("/cart")
@RestController
public class CartController extends BaseApi<Cart> implements CartApi {

    @Autowired
    private CartService cartService;

    @Override
    public Result<CartResultDTO> getCart() {
        return Result.success(cartService.getCart());
    }

    @Override
    public Result addGoodsToCart(CartParamDTO cartParamDTO) {
        cartService.addGoodsToCart(cartParamDTO);
        return Result.success();
    }

    @Override
    public Result updateGoods(CartParamDTO cartParamDTO) {
        cartService.updateGoods(cartParamDTO);
        return Result.success();
    }

    @Override
    public Result<CartCheckoutDTO> checkoutCart(Integer addressId, Integer couponId) {
        return Result.success(cartService.checkoutCart(addressId, couponId));
    }
}
