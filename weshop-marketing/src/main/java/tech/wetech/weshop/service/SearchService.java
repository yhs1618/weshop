package tech.wetech.weshop.service;

import tech.wetech.weshop.dto.SearchIndexDTO;

import java.util.List;

public interface SearchService {

    List<String> helper(String keyword);

    void clearHistory();

    SearchIndexDTO index();

}
