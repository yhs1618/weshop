package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.BrandApiFallback;
import tech.wetech.weshop.po.Brand;

/**
 * @author cjbi@outlook.com
 */

@FeignClient(value = "weshop-goods", path = "brand", fallback = BrandApiFallback.class)
public interface BrandApi extends Api<Brand> {

}
