package com.ztax.prospect.fwd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ztax.common.aspect.DelFill;
import com.ztax.prospect.fwd.entity.FwdEquationDep;

/**
 * <p>
    *  Mapper 接口
 * </p>
**/
public interface FwdEquationDepMapper extends BaseMapper<FwdEquationDep> {

    //逻辑删除 字段填充功能（固定写法）
    @DelFill
    int deleteByIdWithFill(FwdEquationDep entity);
}
