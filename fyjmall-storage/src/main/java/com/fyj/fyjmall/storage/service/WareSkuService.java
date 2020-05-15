package com.fyj.fyjmall.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fyj.common.utils.PageUtils;
import com.fyj.fyjmall.storage.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 18:00:12
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

