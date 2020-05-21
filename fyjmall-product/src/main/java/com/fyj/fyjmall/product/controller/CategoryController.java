package com.fyj.fyjmall.product.controller;

import com.fyj.common.utils.R;
import com.fyj.fyjmall.product.entity.CategoryEntity;
import com.fyj.fyjmall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 商品三级分类
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 17:52:23
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 获取分类树形结构
     */
    @GetMapping("/list/tree")
    public R list(@RequestParam Map<String, Object> params){
        List<CategoryEntity> categoryEntities = categoryService.listCategoryTree();

        return R.ok().put("data", categoryEntities);
    }




    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
