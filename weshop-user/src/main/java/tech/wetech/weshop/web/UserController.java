package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.UserApi;
import tech.wetech.weshop.po.User;

@RestController
@RequestMapping("/user")
public class UserController extends BaseApi<User> implements UserApi {
}
