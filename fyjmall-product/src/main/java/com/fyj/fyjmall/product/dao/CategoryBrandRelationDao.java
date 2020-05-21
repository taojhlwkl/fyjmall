package com.fyj.fyjmall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fyj.fyjmall.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 17:52:23
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCategory(@Param("catId") Long catId, @Param("name") String name);

}
