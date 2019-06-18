package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.GoodsIssueApiFallback;
import tech.wetech.weshop.po.GoodsIssue;

@FeignClient(value = "weshop-goods", path = "goodsIssue", fallback = GoodsIssueApiFallback.class)
public interface GoodsIssueApi extends Api<GoodsIssue> {

}
