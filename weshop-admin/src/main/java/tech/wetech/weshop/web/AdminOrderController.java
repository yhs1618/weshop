package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.OrderApi;
import tech.wetech.weshop.dto.OrderDetailDTO;
import tech.wetech.weshop.enums.OrderStatusEnum;
import tech.wetech.weshop.enums.PayStatusEnum;
import tech.wetech.weshop.po.Order;
import tech.wetech.weshop.query.PageQuery;
import tech.wetech.weshop.query.PageQueryWrapper;
import tech.wetech.weshop.utils.Result;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cjbi@outlook.com
 */
@RestController
@RequestMapping("/admin/order")
@Validated
public class AdminOrderController extends BaseController {

    @Autowired
    private OrderApi orderApi;

    @GetMapping("/list")
    public Result<List<Order>> queryList(Order entity, PageQuery pageQuery) {
        return orderApi.queryPageList(new PageQueryWrapper(pageQuery, entity))
                .addExtra("orderStatus", Arrays.stream(OrderStatusEnum.values()).collect(Collectors.toMap(o -> o, OrderStatusEnum::getName)))
                .addExtra("payStatus", Arrays.stream(PayStatusEnum.values()).collect(Collectors.toMap(p -> p, PayStatusEnum::getName)));
    }

    @GetMapping("/detail")
    public Result<OrderDetailDTO> queryOrderDetail(@RequestParam("orderId") @NotNull Integer orderId) {
        return orderApi.queryOrderDetail(orderId);
    }

}
