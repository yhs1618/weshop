package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.AdApi;
import tech.wetech.weshop.po.Ad;

@Component
public class AdApiFallback extends ApiFallback<Ad> implements AdApi {
}
