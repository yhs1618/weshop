package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.ProductApi;
import tech.wetech.weshop.po.Product;

@RequestMapping("/product")
@RestController
public class ProductController extends BaseApi<Product> implements ProductApi {
}
