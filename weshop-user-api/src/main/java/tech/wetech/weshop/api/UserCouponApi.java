package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.UserCouponApiFallback;
import tech.wetech.weshop.po.UserCoupon;

@FeignClient(value = "weshop-user", path = "userCoupon", fallback = UserCouponApiFallback.class)
public interface UserCouponApi extends Api<UserCoupon> {
}
