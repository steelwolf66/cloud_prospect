package ${package.Mapper};

import ${package.Entity}.${entity};
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ztax.common.aspect.DelFill;

/**
 * <p>
    * ${table.comment!} Mapper 接口
 * </p>
**/
<#if kotlin>
interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
public interface ${table.mapperName} extends BaseMapper<${entity}> {

    //逻辑删除 字段填充功能（固定写法）
    @DelFill
    int deleteByIdWithFill(${entity} entity);
}
</#if>
