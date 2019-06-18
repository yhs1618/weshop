package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tech.wetech.weshop.dto.CartCheckoutDTO;
import tech.wetech.weshop.dto.CartParamDTO;
import tech.wetech.weshop.dto.CartResultDTO;
import tech.wetech.weshop.fallback.CartApiFallback;
import tech.wetech.weshop.po.Cart;
import tech.wetech.weshop.utils.Result;

@FeignClient(value = "weshop-order", path = "cart", fallback = CartApiFallback.class)
public interface CartApi extends Api<Cart> {

    @GetMapping("/getCart")
    Result<CartResultDTO> getCart();

    @PostMapping("/addGoodsToCart")
    Result addGoodsToCart(@RequestBody CartParamDTO cartParamDTO);

    @PostMapping("/updateGoods")
    Result updateGoods(@RequestBody CartParamDTO cartParamDTO);

    @GetMapping("/checkoutCart")
    Result<CartCheckoutDTO> checkoutCart(@RequestParam("addressId") Integer addressId, @RequestParam("couponId") Integer couponId);
}
