package com.fyj.fyjmall.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fyj.common.utils.PageUtils;
import com.fyj.fyjmall.storage.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 18:00:12
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

