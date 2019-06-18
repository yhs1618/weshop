package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tech.wetech.weshop.bo.GoodsFootprintBO;
import tech.wetech.weshop.fallback.FootprintApiFallback;
import tech.wetech.weshop.po.Footprint;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@FeignClient(value = "weshop-user", path = "footprint", fallback = FootprintApiFallback.class)
public interface FootprintApi extends Api<Footprint> {

    @GetMapping("/queryGoodsFootprintTimeLine")
    Result<List<List<GoodsFootprintBO>>> queryGoodsFootprintTimeLine();
}
