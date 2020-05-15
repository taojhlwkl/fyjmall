package com.fyj.fyjmall.member.dao;

import com.fyj.fyjmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 18:03:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
