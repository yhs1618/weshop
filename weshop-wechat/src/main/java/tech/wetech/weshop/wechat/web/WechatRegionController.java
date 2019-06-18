package tech.wetech.weshop.wechat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.RegionApi;
import tech.wetech.weshop.po.Region;
import tech.wetech.weshop.utils.Result;
import tech.wetech.weshop.web.BaseController;

import java.util.List;

@RestController
@RequestMapping("/wechat/region")
public class WechatRegionController extends BaseController {

    @Autowired
    private RegionApi regionApi;

    @GetMapping("/list")
    public Result<List<Region>> queryList(Short parentId) {
        return regionApi.queryList(new Region().setParentId(parentId));
    }

}
