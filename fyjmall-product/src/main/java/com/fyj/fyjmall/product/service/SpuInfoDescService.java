package com.fyj.fyjmall.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.fyj.common.utils.PageUtils;
import com.fyj.fyjmall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 17:52:23
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfoDesc(SpuInfoDescEntity descEntity);


}

