package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.GoodsGalleryApi;
import tech.wetech.weshop.po.GoodsGallery;

@RestController
@RequestMapping("/goodsGallery")
public class GoodsGalleryController extends BaseApi<GoodsGallery> implements GoodsGalleryApi {
}
