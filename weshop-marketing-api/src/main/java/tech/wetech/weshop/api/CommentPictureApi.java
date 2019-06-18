package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.CommentPictureApiFallback;
import tech.wetech.weshop.po.CommentPicture;

@FeignClient(value = "weshop-marketing", path = "commentPicture", fallback = CommentPictureApiFallback.class)
public interface CommentPictureApi extends Api<CommentPicture> {
}
