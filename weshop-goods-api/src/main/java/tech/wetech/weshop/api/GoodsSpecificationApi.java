package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.wetech.weshop.fallback.GoodsSpecificationApiFallback;
import tech.wetech.weshop.po.GoodsSpecification;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@FeignClient(value = "weshop-goods", path = "goodsSpecification", fallback = GoodsSpecificationApiFallback.class)
public interface GoodsSpecificationApi extends Api<GoodsSpecification> {

    @GetMapping("/queryValueByGoodsIdAndIdIn")
    Result<List<String>> queryValueByGoodsIdAndIdIn(@RequestParam("goodsId") Integer goodsId, @RequestParam("goodsSpecificationIds") List<Integer> goodsSpecificationIds);
}
