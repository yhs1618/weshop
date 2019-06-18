package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.ChannelApiFallback;
import tech.wetech.weshop.po.Channel;

@FeignClient(value = "weshop-goods", path = "channel", fallback = ChannelApiFallback.class)
public interface ChannelApi extends Api<Channel> {

}
