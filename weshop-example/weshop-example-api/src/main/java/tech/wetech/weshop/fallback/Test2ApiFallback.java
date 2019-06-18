package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.Test2Api;

@Component
public class Test2ApiFallback implements Test2Api {
    @Override
    public String sayHello(String name) {
        return "service2 is invalid!";
    }
}
