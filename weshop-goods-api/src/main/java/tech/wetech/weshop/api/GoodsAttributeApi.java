package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.GoodsAttributeApiFallback;
import tech.wetech.weshop.po.GoodsAttribute;

@FeignClient(value = "weshop-goods", path = "goodsAttribute", fallback = GoodsAttributeApiFallback.class)
public interface GoodsAttributeApi extends Api<GoodsAttribute> {

}
