package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.CommentApi;
import tech.wetech.weshop.dto.CommentCountDTO;
import tech.wetech.weshop.dto.CommentResultDTO;
import tech.wetech.weshop.enums.ResultCodeEnum;
import tech.wetech.weshop.po.Comment;
import tech.wetech.weshop.query.CommentQuery;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@Component
public class CommentApiFallback extends ApiFallback<Comment> implements CommentApi {
    @Override
    public Result<List<CommentResultDTO>> queryList(CommentQuery commentQuery) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }

    @Override
    public Result<CommentCountDTO> countList(CommentQuery commentQuery) {
        return Result.failure(ResultCodeEnum.REMOTE_SERVICE_ERROR);
    }
}
