package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.GoodsGalleryApi;
import tech.wetech.weshop.po.GoodsGallery;

@Component
public class GoodsGalleryApiFallback extends ApiFallback<GoodsGallery> implements GoodsGalleryApi {
}
