package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.OrderApi;
import tech.wetech.weshop.dto.OrderDetailDTO;
import tech.wetech.weshop.dto.OrderListDTO;
import tech.wetech.weshop.dto.OrderSubmitParamDTO;
import tech.wetech.weshop.po.Order;
import tech.wetech.weshop.query.OrderQuery;
import tech.wetech.weshop.service.OrderService;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseApi<Order> implements OrderApi {

    @Autowired
    private OrderService orderService;

    @Override
    public Result<List<OrderListDTO>> queryOrderList(OrderQuery orderQuery) {
        return Result.success(orderService.queryOrderList(orderQuery));
    }

    @Override
    public Result<OrderDetailDTO> queryOrderDetail(Integer orderId) {
        return Result.success(orderService.queryOrderDetail(orderId));
    }

    @Override
    public Result<Order> submitOrder(OrderSubmitParamDTO orderSubmitParamDTO) {
        return Result.success(orderService.submitOrder(orderSubmitParamDTO));
    }
}
