package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.HomeApi;
import tech.wetech.weshop.dto.HomeIndexDTO;
import tech.wetech.weshop.service.HomeService;
import tech.wetech.weshop.utils.Result;

@RestController
@RequestMapping("/home")
public class HomeController implements HomeApi {

    @Autowired
    private HomeService homeService;

    @Override
    public Result<HomeIndexDTO> index() {
        return Result.success(homeService.index());
    }
}
