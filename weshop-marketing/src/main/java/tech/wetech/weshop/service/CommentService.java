package tech.wetech.weshop.service;

import tech.wetech.weshop.dto.CommentCountDTO;
import tech.wetech.weshop.dto.CommentResultDTO;
import tech.wetech.weshop.po.Comment;
import tech.wetech.weshop.query.CommentQuery;

import java.util.List;

/**
 * @author cjbi@outlook.com
 */
public interface CommentService extends IService<Comment> {

    List<CommentResultDTO> queryList(CommentQuery commentQuery);

    CommentCountDTO countList(CommentQuery commentQuery);
}
