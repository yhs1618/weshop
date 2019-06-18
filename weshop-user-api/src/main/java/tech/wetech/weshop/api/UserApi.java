package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.UserApiFallback;
import tech.wetech.weshop.po.User;

@FeignClient(value = "weshop-user", path = "user", fallback = UserApiFallback.class)
public interface UserApi extends Api<User> {
}
