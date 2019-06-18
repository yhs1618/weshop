package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.UserLevelApiFallback;
import tech.wetech.weshop.po.UserLevel;

@FeignClient(value = "weshop-user", path = "userLevel", fallback = UserLevelApiFallback.class)
public interface UserLevelApi extends Api<UserLevel> {
}
