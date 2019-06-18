package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.TopicApi;
import tech.wetech.weshop.po.Topic;

@RestController
@RequestMapping("/topic")
public class TopicController extends BaseApi<Topic> implements TopicApi {
}
