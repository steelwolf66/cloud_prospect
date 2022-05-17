package com.ztax.prospect.fwd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
方程信息表
 *
 * @since 2022-04-20
 */
@TableName("fwd_equation")
public class FwdEquation extends Model<FwdEquation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "equation_uuid", type = IdType.UUID)
    private String equationUuid;

    @TableField("fwd_plan_uuid")
    private String fwdPlanUuid;

    @TableField("company_uuid")
    private String companyUuid;

    @TableField("equation_code")
    private String equationCode;

    @TableField("predictive_value_type")
    private String predictiveValueType;

    @TableField("risk_connect_equation")
    private String riskConnectEquation;

    @TableField("equation_min")
    private BigDecimal equationMin;

    @TableField("equation_avg")
    private BigDecimal equationAvg;

    @TableField("euqation_max")
    private BigDecimal euqationMax;

    @TableField("create_id")
    private String createId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_id")
    private String updateId;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("delete_id")
    private String deleteId;

    @TableField("delete_time")
    private LocalDateTime deleteTime;

    @TableField("del_flg")
    private Boolean delFlg;

    public String getEquationUuid() {
        return equationUuid;
    }

    public FwdEquation setEquationUuid(String equationUuid) {
        this.equationUuid = equationUuid;
        return this;
    }
    public String getFwdPlanUuid() {
        return fwdPlanUuid;
    }

    public FwdEquation setFwdPlanUuid(String fwdPlanUuid) {
        this.fwdPlanUuid = fwdPlanUuid;
        return this;
    }
    public String getCompanyUuid() {
        return companyUuid;
    }

    public FwdEquation setCompanyUuid(String companyUuid) {
        this.companyUuid = companyUuid;
        return this;
    }
    public String getEquationCode() {
        return equationCode;
    }

    public FwdEquation setEquationCode(String equationCode) {
        this.equationCode = equationCode;
        return this;
    }
    public String getPredictiveValueType() {
        return predictiveValueType;
    }

    public FwdEquation setPredictiveValueType(String predictiveValueType) {
        this.predictiveValueType = predictiveValueType;
        return this;
    }
    public String getRiskConnectEquation() {
        return riskConnectEquation;
    }

    public FwdEquation setRiskConnectEquation(String riskConnectEquation) {
        this.riskConnectEquation = riskConnectEquation;
        return this;
    }
    public BigDecimal getEquationMin() {
        return equationMin;
    }

    public FwdEquation setEquationMin(BigDecimal equationMin) {
        this.equationMin = equationMin;
        return this;
    }
    public BigDecimal getEquationAvg() {
        return equationAvg;
    }

    public FwdEquation setEquationAvg(BigDecimal equationAvg) {
        this.equationAvg = equationAvg;
        return this;
    }
    public BigDecimal getEuqationMax() {
        return euqationMax;
    }

    public FwdEquation setEuqationMax(BigDecimal euqationMax) {
        this.euqationMax = euqationMax;
        return this;
    }
    public String getCreateId() {
        return createId;
    }

    public FwdEquation setCreateId(String createId) {
        this.createId = createId;
        return this;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public FwdEquation setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getUpdateId() {
        return updateId;
    }

    public FwdEquation setUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public FwdEquation setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getDeleteId() {
        return deleteId;
    }

    public FwdEquation setDeleteId(String deleteId) {
        this.deleteId = deleteId;
        return this;
    }
    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public FwdEquation setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }
    public Boolean getDelFlg() {
        return delFlg;
    }

    public FwdEquation setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.equationUuid;
    }

    @Override
    public String toString() {
        return "FwdEquation{" +
            "equationUuid=" + equationUuid +
            ", fwdPlanUuid=" + fwdPlanUuid +
            ", companyUuid=" + companyUuid +
            ", equationCode=" + equationCode +
            ", predictiveValueType=" + predictiveValueType +
            ", riskConnectEquation=" + riskConnectEquation +
            ", equationMin=" + equationMin +
            ", equationAvg=" + equationAvg +
            ", euqationMax=" + euqationMax +
            ", createId=" + createId +
            ", createTime=" + createTime +
            ", updateId=" + updateId +
            ", updateTime=" + updateTime +
            ", deleteId=" + deleteId +
            ", deleteTime=" + deleteTime +
            ", delFlg=" + delFlg +
        "}";
    }

}
