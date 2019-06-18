package tech.wetech.weshop.fallback;

import org.springframework.stereotype.Component;
import tech.wetech.weshop.api.TopicApi;
import tech.wetech.weshop.po.Topic;

/**
 * @author cjbi
 */
@Component
public class TopicApiFallback extends ApiFallback<Topic> implements TopicApi {
}
