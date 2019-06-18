package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.UserLevelApi;
import tech.wetech.weshop.po.UserLevel;

@Component
public class UserLevelApiFallback extends ApiFallback<UserLevel> implements UserLevelApi {
}
