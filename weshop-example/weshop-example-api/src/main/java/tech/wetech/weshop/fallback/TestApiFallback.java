package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.TestApi;

@Component
public class TestApiFallback implements TestApi {
    @Override
    public String sayHello(String name) {
        return "service is invalid!";
    }
}
