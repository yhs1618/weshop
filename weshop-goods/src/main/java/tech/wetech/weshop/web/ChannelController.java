package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.ChannelApi;
import tech.wetech.weshop.po.Channel;

@RestController
@RequestMapping("/channel")
public class ChannelController extends BaseApi<Channel> implements ChannelApi {

}
