package com.ztax.prospect.fwd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.ztax.prospect.base.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
    * 威尔逊模型参数表
    * </p>
 *
 * @since 2022-04-20
 */
@TableName("fwd_wilson_param")
public class FwdWilsonParam extends BaseEntity<FwdPlan> {

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "param_uuid", type = IdType.UUID)
    private String paramUuid;

    /**
     * 方案主键
     */
    @TableField("fwd_plan_uuid")
    private String fwdPlanUuid;

    /**
     * 公司主键
     */
    @TableField("company_uuid")
    private String companyUuid;

    /**
     * 单变量-P值
     */
    @TableField("pd_value")
    private BigDecimal pdValue;

    /**
     * 单变量-R方
     */
    @TableField("single_r_square")
    private BigDecimal singleRSquare;

    /**
     * 显著性水平-准入
     */
    @TableField("slentry")
    private BigDecimal slentry;

    /**
     * 显著性水平-留存
     */
    @TableField("slstay")
    private BigDecimal slstay;

    /**
     * 回归方程-P值
     */
    @TableField("regress_pd_value")
    private BigDecimal regressPdValue;

    /**
     * 回归方程-R方
     */
    @TableField("regress_r_square")
    private BigDecimal regressRSquare;

    /**
     * VIF算法
     */
    @TableField("vif_type")
    private String vifType;

    /**
     * VIF阈值
     */
    @TableField("vif_value")
    private BigDecimal vifValue;

    /**
     * 模型选择方式
     */
    @TableField("model_entry_type")
    private String modelEntryType;

    public String getParamUuid() {
        return paramUuid;
    }

    public FwdWilsonParam setParamUuid(String paramUuid) {
        this.paramUuid = paramUuid;
        return this;
    }
    public String getFwdPlanUuid() {
        return fwdPlanUuid;
    }

    public FwdWilsonParam setFwdPlanUuid(String fwdPlanUuid) {
        this.fwdPlanUuid = fwdPlanUuid;
        return this;
    }
    public String getCompanyUuid() {
        return companyUuid;
    }

    public FwdWilsonParam setCompanyUuid(String companyUuid) {
        this.companyUuid = companyUuid;
        return this;
    }
    public BigDecimal getPdValue() {
        return pdValue;
    }

    public FwdWilsonParam setPdValue(BigDecimal pdValue) {
        this.pdValue = pdValue;
        return this;
    }
    public BigDecimal getSingleRSquare() {
        return singleRSquare;
    }

    public FwdWilsonParam setSingleRSquare(BigDecimal singleRSquare) {
        this.singleRSquare = singleRSquare;
        return this;
    }
    public BigDecimal getSlentry() {
        return slentry;
    }

    public FwdWilsonParam setSlentry(BigDecimal slentry) {
        this.slentry = slentry;
        return this;
    }
    public BigDecimal getSlstay() {
        return slstay;
    }

    public FwdWilsonParam setSlstay(BigDecimal slstay) {
        this.slstay = slstay;
        return this;
    }
    public BigDecimal getRegressPdValue() {
        return regressPdValue;
    }

    public FwdWilsonParam setRegressPdValue(BigDecimal regressPdValue) {
        this.regressPdValue = regressPdValue;
        return this;
    }
    public BigDecimal getRegressRSquare() {
        return regressRSquare;
    }

    public FwdWilsonParam setRegressRSquare(BigDecimal regressRSquare) {
        this.regressRSquare = regressRSquare;
        return this;
    }
    public String getVifType() {
        return vifType;
    }

    public FwdWilsonParam setVifType(String vifType) {
        this.vifType = vifType;
        return this;
    }
    public BigDecimal getVifValue() {
        return vifValue;
    }

    public FwdWilsonParam setVifValue(BigDecimal vifValue) {
        this.vifValue = vifValue;
        return this;
    }
    public String getModelEntryType() {
        return modelEntryType;
    }

    public FwdWilsonParam setModelEntryType(String modelEntryType) {
        this.modelEntryType = modelEntryType;
        return this;
    }
    @Override
    protected Serializable pkVal() {
        return this.paramUuid;
    }

    @Override
    public String toString() {
        return "FwdWilsonParam{" +
            "paramUuid=" + paramUuid +
            ", fwdPlanUuid=" + fwdPlanUuid +
            ", companyUuid=" + companyUuid +
            ", pdValue=" + pdValue +
            ", singleRSquare=" + singleRSquare +
            ", slentry=" + slentry +
            ", slstay=" + slstay +
            ", regressPdValue=" + regressPdValue +
            ", regressRSquare=" + regressRSquare +
            ", vifType=" + vifType +
            ", vifValue=" + vifValue +
            ", modelEntryType=" + modelEntryType +
        "}";
    }

}
