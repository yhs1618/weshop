package tech.wetech.weshop.goods.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.goods.api.BrandApi;
import tech.wetech.weshop.goods.po.Brand;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseApi<Brand> implements BrandApi {

}
