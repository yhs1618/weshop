package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.BrandApi;
import tech.wetech.weshop.po.Brand;

@Component
public class BrandApiFallback extends ApiFallback<Brand> implements BrandApi {


}
