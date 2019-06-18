package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.CommentApi;
import tech.wetech.weshop.dto.CommentCountDTO;
import tech.wetech.weshop.dto.CommentResultDTO;
import tech.wetech.weshop.po.Comment;
import tech.wetech.weshop.query.CommentQuery;
import tech.wetech.weshop.service.CommentService;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController extends BaseApi<Comment> implements CommentApi {

    @Autowired
    private CommentService commentService;

    @Override
    public Result<List<CommentResultDTO>> queryList(CommentQuery commentQuery) {
        return Result.success(commentService.queryList(commentQuery));
    }

    @Override
    public Result<CommentCountDTO> countList(CommentQuery commentQuery) {
        return Result.success(commentService.countList(commentQuery));
    }
}
