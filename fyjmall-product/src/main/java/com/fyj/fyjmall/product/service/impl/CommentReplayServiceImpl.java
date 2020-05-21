package com.fyj.fyjmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fyj.common.utils.PageUtils;
import com.fyj.common.utils.Query;
import com.fyj.fyjmall.product.dao.CommentReplayDao;
import com.fyj.fyjmall.product.entity.CommentReplayEntity;
import com.fyj.fyjmall.product.service.CommentReplayService;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplayEntity> page = this.page(
                new Query<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

        return new PageUtils(page);
    }

}