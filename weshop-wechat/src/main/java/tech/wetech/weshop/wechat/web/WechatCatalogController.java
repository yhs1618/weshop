package tech.wetech.weshop.wechat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.CategoryApi;
import tech.wetech.weshop.dto.CategoryDTO;
import tech.wetech.weshop.dto.CategoryIndexDTO;
import tech.wetech.weshop.utils.Result;
import tech.wetech.weshop.web.BaseController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/wechat/catalog")
@Validated
public class WechatCatalogController extends BaseController {

    @Autowired
    private CategoryApi categoryApi;

    @GetMapping("/index")
    public Result<CategoryIndexDTO> index(Integer id) {
        return categoryApi.index(id);
    }

    @GetMapping("/current")
    public Result<CategoryDTO> current(@NotNull @RequestParam("id") Integer id) {
        return categoryApi.current(id);
    }

}
