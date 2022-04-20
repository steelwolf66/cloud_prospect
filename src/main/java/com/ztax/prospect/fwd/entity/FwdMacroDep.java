package com.ztax.prospect.fwd.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
    * 
    * </p>
 *
 * @since 2022-04-20
 */
@TableName("fwd_macro_dep")
public class FwdMacroDep extends Model<FwdMacroDep> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "macro_dep_uuid", type = IdType.UUID)
    private String macroDepUuid;

    @TableField("fwd_plan_uuid")
    private String fwdPlanUuid;

    @TableField("company_uuid")
    private String companyUuid;

    @TableField("macro_code")
    private String macroCode;

    @TableField("macro_name")
    private String macroName;

    @TableField("correlation")
    private String correlation;

    public String getMacroDepUuid() {
        return macroDepUuid;
    }

    public FwdMacroDep setMacroDepUuid(String macroDepUuid) {
        this.macroDepUuid = macroDepUuid;
        return this;
    }
    public String getFwdPlanUuid() {
        return fwdPlanUuid;
    }

    public FwdMacroDep setFwdPlanUuid(String fwdPlanUuid) {
        this.fwdPlanUuid = fwdPlanUuid;
        return this;
    }
    public String getCompanyUuid() {
        return companyUuid;
    }

    public FwdMacroDep setCompanyUuid(String companyUuid) {
        this.companyUuid = companyUuid;
        return this;
    }
    public String getMacroCode() {
        return macroCode;
    }

    public FwdMacroDep setMacroCode(String macroCode) {
        this.macroCode = macroCode;
        return this;
    }
    public String getMacroName() {
        return macroName;
    }

    public FwdMacroDep setMacroName(String macroName) {
        this.macroName = macroName;
        return this;
    }
    public String getCorrelation() {
        return correlation;
    }

    public FwdMacroDep setCorrelation(String correlation) {
        this.correlation = correlation;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.macroDepUuid;
    }

    @Override
    public String toString() {
        return "FwdMacroDep{" +
            "macroDepUuid=" + macroDepUuid +
            ", fwdPlanUuid=" + fwdPlanUuid +
            ", companyUuid=" + companyUuid +
            ", macroCode=" + macroCode +
            ", macroName=" + macroName +
            ", correlation=" + correlation +
        "}";
    }

}
