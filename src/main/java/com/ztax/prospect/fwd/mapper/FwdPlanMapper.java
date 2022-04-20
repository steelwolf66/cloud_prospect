package com.ztax.prospect.fwd.mapper;

import com.ztax.prospect.fwd.entity.FwdPlan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ztax.common.aspect.DelFill;

/**
 * <p>
    *  Mapper 接口
 * </p>
**/
public interface FwdPlanMapper extends BaseMapper<FwdPlan> {

    //逻辑删除 字段填充功能（固定写法）
    @DelFill
    int deleteByIdWithFill(FwdPlan entity);
}
