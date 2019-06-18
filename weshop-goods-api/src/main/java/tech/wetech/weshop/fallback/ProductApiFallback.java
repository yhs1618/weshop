package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.ProductApi;
import tech.wetech.weshop.po.Product;

@Component
public class ProductApiFallback extends ApiFallback<Product> implements ProductApi {
}
