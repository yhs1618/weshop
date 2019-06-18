package tech.wetech.weshop.wechat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.wetech.weshop.api.CollectApi;
import tech.wetech.weshop.dto.CollectAddOrDeleteParamDTO;
import tech.wetech.weshop.dto.CollectAddOrDeleteResultDTO;
import tech.wetech.weshop.utils.Result;
import tech.wetech.weshop.web.BaseController;

@RestController
@RequestMapping("/wechat/collect")
public class WechatCollectController extends BaseController {

    @Autowired
    private CollectApi collectApi;

    @PostMapping("/add-or-delete")
    public Result<CollectAddOrDeleteResultDTO> addOrDelete(@RequestBody CollectAddOrDeleteParamDTO collectAddOrDeleteParamDTO) {
        return collectApi.addOrDelete(collectAddOrDeleteParamDTO);
    }

    @GetMapping("/list")
    public Result queryList(Integer typeId) {
        return collectApi.queryGoodsCollectList();
    }

}
