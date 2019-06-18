package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.TestApi;
import tech.wetech.weshop.service.TestService;

@RestController
public class TestApiImpl implements TestApi {

    @Autowired
    TestService testService;

    @Override
    public String sayHello(String name) {
        return testService.sayHello(name);
    }
}
