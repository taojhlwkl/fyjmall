package com.fyj.fyjmall.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.fyj.common.utils.PageUtils;
import com.fyj.fyjmall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 17:52:23
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

