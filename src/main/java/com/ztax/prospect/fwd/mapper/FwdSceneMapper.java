package com.ztax.prospect.fwd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ztax.common.aspect.DelFill;
import com.ztax.prospect.fwd.entity.FwdScene;

/**
 * <p>
    *  Mapper 接口
 * </p>
**/
public interface FwdSceneMapper extends BaseMapper<FwdScene> {

    //逻辑删除 字段填充功能（固定写法）
    @DelFill
    int deleteByIdWithFill(FwdScene entity);
}
