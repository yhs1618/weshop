package tech.wetech.weshop.service;

import org.springframework.web.bind.annotation.RequestBody;
import tech.wetech.weshop.bo.GoodsCollectBO;
import tech.wetech.weshop.dto.CollectAddOrDeleteParamDTO;
import tech.wetech.weshop.dto.CollectAddOrDeleteResultDTO;
import tech.wetech.weshop.po.Collect;

import java.util.List;

/**
 * @author cjbi@outlook.com
 */
public interface CollectService extends IService<Collect> {

    CollectAddOrDeleteResultDTO addOrDelete(@RequestBody CollectAddOrDeleteParamDTO collectAddOrDeleteParamDTO);

    List<GoodsCollectBO> queryGoodsCollectList();

}
