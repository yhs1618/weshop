package tech.wetech.weshop.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface TestService {

    String sayHello(@PathVariable String name);

}
