package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.SearchHistoryApiFallback;
import tech.wetech.weshop.po.SearchHistory;

@FeignClient(value = "weshop-marketing", path = "searchHistory", fallback = SearchHistoryApiFallback.class)
public interface SearchHistoryApi extends Api<SearchHistory> {
}
