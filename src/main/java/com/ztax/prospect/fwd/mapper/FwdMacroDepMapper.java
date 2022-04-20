package com.ztax.prospect.fwd.mapper;

import com.ztax.prospect.fwd.entity.FwdMacroDep;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ztax.common.aspect.DelFill;

/**
 * <p>
    *  Mapper 接口
 * </p>
**/
public interface FwdMacroDepMapper extends BaseMapper<FwdMacroDep> {

    //逻辑删除 字段填充功能（固定写法）
    @DelFill
    int deleteByIdWithFill(FwdMacroDep entity);
}
