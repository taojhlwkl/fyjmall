package com.fyj.fyjmall.order.dao;

import com.fyj.fyjmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 17:41:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
