package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.OrderExpressApiFallback;
import tech.wetech.weshop.po.OrderExpress;

@FeignClient(value = "weshop-order", path = "orderExpress", fallback = OrderExpressApiFallback.class)
public interface OrderExpressApi extends Api<OrderExpress> {
}
