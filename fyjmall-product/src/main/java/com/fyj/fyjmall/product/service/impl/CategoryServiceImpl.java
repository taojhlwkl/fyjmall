package com.fyj.fyjmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fyj.common.utils.PageUtils;
import com.fyj.common.utils.Query;
import com.fyj.fyjmall.product.dao.CategoryDao;
import com.fyj.fyjmall.product.entity.CategoryEntity;
import com.fyj.fyjmall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listCategoryTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        return categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                // 设置子分类
                .map(menu -> {
                    menu.setChildCategories(getChildCategories(menu, categoryEntities));
                    return menu;
                })
                // 排序
                .sorted((c1, c2) -> (c1.getSort() == null ? 0 : c1.getSort()) - (c2.getSort() == null ? 0 : c2.getSort()))
                .collect(Collectors.toList());
    }

    /**
     * 获取子分类
     * @param categoryEntity
     * @param categoryEntities
     * @return
     */
    private List<CategoryEntity> getChildCategories(CategoryEntity categoryEntity, List<CategoryEntity> categoryEntities) {
        return categoryEntities.stream()
                // 注意此处一定要用 equals 比较是否相等
//                .filter(category -> categoryEntity.getCatId() == category.getParentCid())
                .filter(category -> categoryEntity.getCatId().equals(category.getParentCid()))
                .map(category -> {
                    category.setChildCategories( getChildCategories(category, categoryEntities));
                    return category;
                } )
                .sorted((c1, c2) -> (c1.getSort() == null ? 0 : c1.getSort()) - (c2.getSort() == null ? 0 : c2.getSort()))
                .collect(Collectors.toList());
    }

}