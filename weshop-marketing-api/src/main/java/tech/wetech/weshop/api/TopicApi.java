package tech.wetech.weshop.api;

import org.springframework.cloud.openfeign.FeignClient;
import tech.wetech.weshop.fallback.TopicApiFallback;
import tech.wetech.weshop.po.Topic;

@FeignClient(value = "weshop-marketing", path = "topic", fallback = TopicApiFallback.class)
public interface TopicApi extends Api<Topic> {
}
