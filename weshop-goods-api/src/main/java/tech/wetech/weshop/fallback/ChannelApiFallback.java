package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.ChannelApi;
import tech.wetech.weshop.po.Channel;

@Component
public class ChannelApiFallback extends ApiFallback<Channel> implements ChannelApi {

}
