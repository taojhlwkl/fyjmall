package com.fyj.fyjmall.member.dao;

import com.fyj.fyjmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 18:03:42
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
