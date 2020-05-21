package com.fyj.fyjmall.storage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fyj.fyjmall.storage.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 18:00:12
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
