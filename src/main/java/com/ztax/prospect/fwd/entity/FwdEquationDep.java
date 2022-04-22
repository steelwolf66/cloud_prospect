package com.ztax.prospect.fwd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
    * 
    * </p>
 *
 * @since 2022-04-20
 */
@TableName("fwd_equation_dep")
public class FwdEquationDep extends Model<FwdEquationDep> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "equation_dep_uuid", type = IdType.UUID)
    private String equationDepUuid;

    @TableField("equation_uuid")
    private String equationUuid;

    @TableField("macro_code")
    private String macroCode;

    @TableField("macro_name")
    private String macroName;

    public String getEquationDepUuid() {
        return equationDepUuid;
    }

    public FwdEquationDep setEquationDepUuid(String equationDepUuid) {
        this.equationDepUuid = equationDepUuid;
        return this;
    }
    public String getEquationUuid() {
        return equationUuid;
    }

    public FwdEquationDep setEquationUuid(String equationUuid) {
        this.equationUuid = equationUuid;
        return this;
    }
    public String getMacroCode() {
        return macroCode;
    }

    public FwdEquationDep setMacroCode(String macroCode) {
        this.macroCode = macroCode;
        return this;
    }
    public String getMacroName() {
        return macroName;
    }

    public FwdEquationDep setMacroName(String macroName) {
        this.macroName = macroName;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.equationDepUuid;
    }

    @Override
    public String toString() {
        return "FwdEquationDep{" +
            "equationDepUuid=" + equationDepUuid +
            ", equationUuid=" + equationUuid +
            ", macroCode=" + macroCode +
            ", macroName=" + macroName +
        "}";
    }

}
