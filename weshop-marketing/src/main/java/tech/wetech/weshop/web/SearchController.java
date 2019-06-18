package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.SearchApi;
import tech.wetech.weshop.dto.SearchIndexDTO;
import tech.wetech.weshop.service.SearchService;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController implements SearchApi {

    @Autowired
    private SearchService searchService;

    @Override
    public Result<List<String>> helper(String keyword) {
        return Result.success(searchService.helper(keyword));
    }

    @Override
    public Result clearHistory() {
        searchService.clearHistory();
        return Result.success();
    }

    @Override
    public Result<SearchIndexDTO> index() {
        return Result.success(searchService.index());
    }
}
