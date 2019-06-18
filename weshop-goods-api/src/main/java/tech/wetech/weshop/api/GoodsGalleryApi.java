package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.GoodsGalleryApiFallback;
import tech.wetech.weshop.po.GoodsGallery;

@FeignClient(value = "weshop-goods", path = "goodsGallery", fallback = GoodsGalleryApiFallback.class)
public interface GoodsGalleryApi extends Api<GoodsGallery> {

}
