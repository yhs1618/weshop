package tech.wetech.weshop.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.wetech.weshop.dto.SearchIndexDTO;
import tech.wetech.weshop.mapper.KeywordsMapper;
import tech.wetech.weshop.mapper.SearchHistoryMapper;
import tech.wetech.weshop.po.Keywords;
import tech.wetech.weshop.po.SearchHistory;
import tech.wetech.weshop.service.SearchService;
import tech.wetech.weshop.utils.Constants;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private KeywordsMapper keywordsMapper;

    @Autowired
    private SearchHistoryMapper searchHistoryMapper;

    @Override
    public List<String> helper(String keyword) {
        return keywordsMapper.selectByKeywordLike("%" + keyword + "%");
    }

    @Override
    public void clearHistory() {
        searchHistoryMapper.delete(new SearchHistory().setUserId(Constants.CURRENT_USER_ID));
    }

    @Override
    public SearchIndexDTO index() {
        // 取出输入框默认的关键词
        PageHelper.offsetPage(0, 1);
        Keywords defaultKeyword = keywordsMapper.selectOne(new Keywords().setIsDefault(true));
        // 取出热闹关键词
        PageHelper.startPage(1, 10);
        List<Keywords> hotKeywordList = keywordsMapper.select(new Keywords().setHot(true));

        PageHelper.startPage(1, 10);
        List<String> historyKeywordList = searchHistoryMapper.select(new SearchHistory().setUserId(Constants.CURRENT_USER_ID)).stream()
                .map(SearchHistory::getKeyword)
                .collect(Collectors.toList());

        return new SearchIndexDTO()
                .setDefaultKeyword(defaultKeyword)
                .setHotKeywordList(hotKeywordList)
                .setHistoryKeywordList(historyKeywordList);
    }

}
