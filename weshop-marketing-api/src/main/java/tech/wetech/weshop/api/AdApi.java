package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.ApiFallback;
import tech.wetech.weshop.po.Ad;

@FeignClient(value = "weshop-marketing", path = "ad", fallback = ApiFallback.class)
public interface AdApi extends Api<Ad> {
}
