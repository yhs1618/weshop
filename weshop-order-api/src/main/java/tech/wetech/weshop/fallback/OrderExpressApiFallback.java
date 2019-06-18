package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.OrderExpressApi;
import tech.wetech.weshop.po.OrderExpress;

@Component
public class OrderExpressApiFallback extends ApiFallback<OrderExpress> implements OrderExpressApi {
}
