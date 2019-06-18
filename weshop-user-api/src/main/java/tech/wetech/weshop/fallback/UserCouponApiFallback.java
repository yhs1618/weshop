package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.UserCouponApi;
import tech.wetech.weshop.po.UserCoupon;

@Component
public class UserCouponApiFallback extends ApiFallback<UserCoupon> implements UserCouponApi {
}
