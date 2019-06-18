package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.SearchHistoryApi;
import tech.wetech.weshop.po.SearchHistory;

@RestController
@RequestMapping("/searchHistory")
public class SearchHistoryController extends BaseApi<SearchHistory> implements SearchHistoryApi {
}
