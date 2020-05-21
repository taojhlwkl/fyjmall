package com.fyj.fyjmall.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.fyj.common.utils.PageUtils;
import com.fyj.fyjmall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 17:52:23
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

