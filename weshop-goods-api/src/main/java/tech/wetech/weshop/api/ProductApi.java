package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.ProductApiFallback;
import tech.wetech.weshop.po.Product;

@FeignClient(value = "weshop-goods", path = "product", fallback = ProductApiFallback.class)
public interface ProductApi extends Api<Product> {
}
