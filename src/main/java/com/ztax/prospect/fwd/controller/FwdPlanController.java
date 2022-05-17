package com.ztax.prospect.fwd.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztax.common.exception.BizException;
import com.ztax.common.result.Result;
import com.ztax.common.utils.ObjectUtils;
import com.ztax.common.utils.UuidUtil;
import com.ztax.prospect.fwd.entity.FwdPlan;
import com.ztax.prospect.fwd.service.impl.FwdPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fwd")
public class FwdPlanController {
    @Autowired
    private FwdPlanServiceImpl fwdPlanService;

    /**
     * 新增前瞻性方案
     *
     * @param paramEntity
     * @return
     */
    @PostMapping("/plan")
    public Result<FwdPlan> addPlan(@RequestBody FwdPlan paramEntity) {
        if (ObjectUtils.isNotBlank(paramEntity.getFwdPlanUuid())) {
            paramEntity.setFwdPlanUuid(UuidUtil.get32Uuid());
        }
        fwdPlanService.save(paramEntity);
        return Result.success(paramEntity);
    }

    /**
     * 删除
     *
     * @param fwdPlanUuid
     * @return
     */
    @DeleteMapping("/plan/{fwdPlanUuid}")
    public Result<String> deletePlanById(@PathVariable("fwdPlanUuid") String fwdPlanUuid) {
        if (ObjectUtils.isBlank(fwdPlanUuid)) {
            throw new BizException("主键不可为空");
        }
        //todo 校验
        fwdPlanService.deleteByIdWithFill(fwdPlanUuid);
        return Result.success(fwdPlanUuid);
    }

    @PutMapping("/plan")
    public Result<FwdPlan> updateById(@RequestBody FwdPlan paramEntity) {
        //主键不可为空
        if (ObjectUtils.isBlank(paramEntity.getFwdPlanUuid())) {
            throw new BizException("主键不可为空");
        }
        fwdPlanService.updateById(paramEntity);

        return Result.success(paramEntity);
    }

    /**
     * 分页查询
     *
     * @param paramEntity
     * @return
     */
    @PostMapping("/plan/page")
    public Result<Page<FwdPlan>> page(@RequestBody FwdPlan paramEntity) {
        Page<FwdPlan> paramPage = new Page<FwdPlan>(paramEntity.getPageNo(), paramEntity.getPageSize());
        //todo 设置查询属性
        QueryWrapper<FwdPlan> queryWrapper = new QueryWrapper<>();

        Page<FwdPlan> planPage = fwdPlanService.page(paramPage, queryWrapper);
        return Result.success(planPage);
    }
}