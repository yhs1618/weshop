package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.wetech.weshop.fallback.RegionApiFallback;
import tech.wetech.weshop.po.Region;
import tech.wetech.weshop.utils.Result;

@FeignClient(value = "weshop-user", path = "region", fallback = RegionApiFallback.class)
public interface RegionApi extends Api<Region> {

    @GetMapping("/queryNameById")
    Result<String> queryNameById(@RequestParam("id") Short id);
}
