package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.UserApi;
import tech.wetech.weshop.po.User;

@Component
public class UserApiFallback extends ApiFallback<User> implements UserApi {
}
