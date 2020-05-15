package com.fyj.fyjmall.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fyj.common.utils.PageUtils;
import com.fyj.fyjmall.storage.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 18:00:12
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

