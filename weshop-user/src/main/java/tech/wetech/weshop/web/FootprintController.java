package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.FootprintApi;
import tech.wetech.weshop.bo.GoodsFootprintBO;
import tech.wetech.weshop.po.Footprint;
import tech.wetech.weshop.service.FootprintService;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@RestController
@RequestMapping("footprint")
public class FootprintController extends BaseApi<Footprint> implements FootprintApi {

    @Autowired
    private FootprintService footprintService;

    @Override
    public Result<List<List<GoodsFootprintBO>>> queryGoodsFootprintTimeLine() {
        return Result.success(footprintService.queryGoodsFootprintTimeLine());
    }
}
