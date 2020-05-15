package com.fyj.fyjmall.order.dao;

import com.fyj.fyjmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 17:41:35
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
