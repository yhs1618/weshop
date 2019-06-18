package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.OrderExpressApi;
import tech.wetech.weshop.po.OrderExpress;

@RestController
@RequestMapping("/orderExpress")
public class OrderExpressController extends BaseApi<OrderExpress> implements OrderExpressApi {
}
