package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.OrderApi;
import tech.wetech.weshop.dto.OrderDetailDTO;
import tech.wetech.weshop.dto.OrderListDTO;
import tech.wetech.weshop.dto.OrderSubmitParamDTO;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.Order;
import tech.wetech.weshop.query.OrderQuery;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@Component
public class OrderApiFallback extends ApiFallback<Order> implements OrderApi {
    @Override
    public Result<List<OrderListDTO>> queryOrderList(OrderQuery orderQuery) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<OrderDetailDTO> queryOrderDetail(Integer orderId) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<Order> submitOrder(OrderSubmitParamDTO orderSubmitParamDTO) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
