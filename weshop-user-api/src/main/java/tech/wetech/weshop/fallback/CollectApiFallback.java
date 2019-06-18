package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.CollectApi;
import tech.wetech.weshop.bo.GoodsCollectBO;
import tech.wetech.weshop.dto.CollectAddOrDeleteParamDTO;
import tech.wetech.weshop.dto.CollectAddOrDeleteResultDTO;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.Collect;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@Component
public class CollectApiFallback extends ApiFallback<Collect> implements CollectApi {
    @Override
    public Result<CollectAddOrDeleteResultDTO> addOrDelete(CollectAddOrDeleteParamDTO collectAddOrDeleteParamDTO) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<List<GoodsCollectBO>> queryGoodsCollectList() {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
