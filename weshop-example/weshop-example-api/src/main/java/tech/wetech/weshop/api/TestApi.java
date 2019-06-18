package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tech.wetech.weshop.fallback.TestApiFallback;

@FeignClient(value = "weshop-example-provider", fallback = TestApiFallback.class)
public interface TestApi {

    @GetMapping("/hello/{name}")
    String sayHello(@PathVariable String name);

}