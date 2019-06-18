package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.api.CategoryApi;
import tech.wetech.weshop.dto.CategoryDTO;
import tech.wetech.weshop.dto.CategoryIndexDTO;
import tech.wetech.weshop.enums.CategoryLevelEnum;
import tech.wetech.weshop.po.Category;
import tech.wetech.weshop.service.CategoryService;
import tech.wetech.weshop.utils.Result;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController extends BaseApi<Category> implements CategoryApi {

    @Autowired
    private CategoryService categoryService;

    @Override
    public Result<List<Category>> queryCategoryByLevel(CategoryLevelEnum categoryLevel) {
        return Result.success(categoryService.queryCategoryByLevel(categoryLevel));
    }

    @Override
    public Result<CategoryIndexDTO> index(Integer cateogyId) {
        return Result.success(categoryService.index(cateogyId));
    }

    @Override
    public Result<CategoryDTO> current(Integer id) {
        return Result.success(categoryService.current(id));
    }
}
