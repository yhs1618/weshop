package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tech.wetech.weshop.dto.HomeIndexDTO;
import tech.wetech.weshop.fallback.HomeApiFallback;
import tech.wetech.weshop.utils.Result;

@FeignClient(value = "weshop-marketing", path = "home", fallback = HomeApiFallback.class)
public interface HomeApi {

    @GetMapping("/index")
    Result<HomeIndexDTO> index();
}
