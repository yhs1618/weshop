package tech.wetech.weshop.wechat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.FootprintApi;
import tech.wetech.weshop.bo.GoodsFootprintBO;
import tech.wetech.weshop.po.Footprint;
import tech.wetech.weshop.utils.Constants;
import tech.wetech.weshop.utils.Result;
import tech.wetech.weshop.web.BaseController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/wechat/footprint")
@Validated
public class WechatFootprintController extends BaseController {

    @Autowired
    private FootprintApi footprintApi;

    @GetMapping("/list")
    public Result<List<List<GoodsFootprintBO>>> queryGoodsFootprintList() {
        return footprintApi.queryGoodsFootprintTimeLine();
    }

    @PostMapping("/delete")
    public Result deleteGoodsFootprint(@NotNull Integer goodsId) {
        return footprintApi.delete(new Footprint().setGoodsId(goodsId).setUserId(Constants.CURRENT_USER_ID));
    }

}
