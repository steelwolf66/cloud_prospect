package com.ztax.prospect.fwd.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
    * 
    * </p>
 *
 * @since 2022-04-20
 */
@TableName("fwd_wilson_param")
public class FwdWilsonParam extends Model<FwdWilsonParam> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "param_uuid", type = IdType.UUID)
    private String paramUuid;

    @TableField("fwd_plan_uuid")
    private String fwdPlanUuid;

    @TableField("company_uuid")
    private String companyUuid;

    @TableField("pd_value")
    private BigDecimal pdValue;

    @TableField("single_r_square")
    private BigDecimal singleRSquare;

    @TableField("slentry")
    private BigDecimal slentry;

    @TableField("slstay")
    private BigDecimal slstay;

    @TableField("regress_pd_value")
    private BigDecimal regressPdValue;

    @TableField("regress_r_square")
    private BigDecimal regressRSquare;

    @TableField("vif_type")
    private String vifType;

    @TableField("vif_value")
    private BigDecimal vifValue;

    @TableField("model_entry_type")
    private String modelEntryType;

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
    private Integer delFlg;

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
    public String getCreateId() {
        return createId;
    }

    public FwdWilsonParam setCreateId(String createId) {
        this.createId = createId;
        return this;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public FwdWilsonParam setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getUpdateId() {
        return updateId;
    }

    public FwdWilsonParam setUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public FwdWilsonParam setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getDeleteId() {
        return deleteId;
    }

    public FwdWilsonParam setDeleteId(String deleteId) {
        this.deleteId = deleteId;
        return this;
    }
    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public FwdWilsonParam setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }
    public Integer getDelFlg() {
        return delFlg;
    }

    public FwdWilsonParam setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
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
