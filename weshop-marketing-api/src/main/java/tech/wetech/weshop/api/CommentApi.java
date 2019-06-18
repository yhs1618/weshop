package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.wetech.weshop.dto.CommentCountDTO;
import tech.wetech.weshop.dto.CommentResultDTO;
import tech.wetech.weshop.fallback.CommentApiFallback;
import tech.wetech.weshop.po.Comment;
import tech.wetech.weshop.query.CommentQuery;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@FeignClient(value = "weshop-marketing", path = "comment", fallback = CommentApiFallback.class)
public interface CommentApi extends Api<Comment> {

    @PostMapping("/queryList2")
    Result<List<CommentResultDTO>> queryList(@RequestBody CommentQuery commentQuery);

    @PostMapping("/countList")
    Result<CommentCountDTO> countList(@RequestBody CommentQuery commentQuery);
}
