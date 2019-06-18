package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.GoodsIssueApi;
import tech.wetech.weshop.po.GoodsIssue;

@Component
public class GoodsIssueApiFallback extends ApiFallback<GoodsIssue> implements GoodsIssueApi {
}
