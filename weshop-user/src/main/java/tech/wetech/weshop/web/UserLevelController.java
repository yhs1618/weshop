package tech.wetech.weshop.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.UserLevelApi;
import tech.wetech.weshop.po.UserLevel;

@RestController
@RequestMapping("/userLevel")
public class UserLevelController extends BaseApi<UserLevel> implements UserLevelApi {
}
