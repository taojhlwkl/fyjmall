package com.fyj.fyjmall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fyj.fyjmall.product.entity.AttrAttrgroupRelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 17:52:23
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {

    void deleteBatchRelation(@Param("entities") List<AttrAttrgroupRelationEntity> entities);

}
