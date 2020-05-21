package com.fyj.fyjmall.coupon.controller;

import com.fyj.common.to.SkuReductionTo;
import com.fyj.common.utils.PageUtils;
import com.fyj.common.utils.R;
import com.fyj.fyjmall.coupon.entity.SkuFullReductionEntity;
import com.fyj.fyjmall.coupon.service.SkuFullReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;




/**
 * 商品满减信息
 *
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 16:17:42
 */
@RestController
@RequestMapping("coupon/skufullreduction")
public class SkuFullReductionController {
    @Autowired
    private SkuFullReductionService skuFullReductionService;


    @PostMapping("/saveinfo")
    public R saveInfo(@RequestBody SkuReductionTo reductionTo){

        skuFullReductionService.saveSkuReduction(reductionTo);
        return R.ok();
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:skufullreduction:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuFullReductionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:skufullreduction:info")
    public R info(@PathVariable("id") Long id){
		SkuFullReductionEntity skuFullReduction = skuFullReductionService.getById(id);

        return R.ok().put("skuFullReduction", skuFullReduction);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:skufullreduction:save")
    public R save(@RequestBody SkuFullReductionEntity skuFullReduction){
		skuFullReductionService.save(skuFullReduction);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:skufullreduction:update")
    public R update(@RequestBody SkuFullReductionEntity skuFullReduction){
		skuFullReductionService.updateById(skuFullReduction);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:skufullreduction:delete")
    public R delete(@RequestBody Long[] ids){
		skuFullReductionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
