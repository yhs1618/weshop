package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.SearchHistoryApi;
import tech.wetech.weshop.po.SearchHistory;

@Component
public class SearchHistoryApiFallback extends ApiFallback<SearchHistory> implements SearchHistoryApi {
}
