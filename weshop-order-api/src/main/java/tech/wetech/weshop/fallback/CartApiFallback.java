package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.CartApi;
import tech.wetech.weshop.dto.CartCheckoutDTO;
import tech.wetech.weshop.dto.CartParamDTO;
import tech.wetech.weshop.dto.CartResultDTO;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.Cart;
import tech.wetech.weshop.utils.Result;

@Component
public class CartApiFallback extends ApiFallback<Cart> implements CartApi {
    @Override
    public Result<CartResultDTO> getCart() {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result addGoodsToCart(CartParamDTO cartParamDTO) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result updateGoods(CartParamDTO cartParamDTO) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<CartCheckoutDTO> checkoutCart(Integer addressId, Integer couponId) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
