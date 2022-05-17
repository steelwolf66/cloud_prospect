package com.ztax.prospect.fwd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ztax.prospect.base.BaseEntity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
    * 前瞻性依赖
    * </p>
 *
 * @since 2022-04-20
 */
@TableName("fwd_plan")
public class FwdPlan extends BaseEntity<FwdPlan> {

    private static final long serialVersionUID = 1L;

    //主键
    @TableId(value = "fwd_plan_uuid", type = IdType.UUID)
    private String fwdPlanUuid;

    //方案名称
    @TableField("plan_name")
    private String planName;

    //方案编码
    @TableField("plan_code")
    private String planCode;

    //模型编码
    @TableField("model_code")
    private String modelCode;

    //模型名称
    @TableField("model_name")
    private String modelName;

    //开始日期
    @TableField("start_date")
    private LocalDateTime startDate;

    //结束日期
    @TableField("end_date")
    private LocalDateTime endDate;

    //业务类型
    @TableField("buss_type")
    private String bussType;

    //业务类型名称
    @TableField("buss_type_name")
    private String bussTypeName;

    //状态
    @TableField("plan_status")
    private String planStatus;

    //是否锁定
    @TableField("is_lock")
    private Boolean isLock;

    //公司id
    @TableField("company_uuid")
    private String companyUuid;

    @TableField("vdef1")
    private String vdef1;

    @TableField("vdef2")
    private String vdef2;

    @TableField("vdef3")
    private String vdef3;

    public String getFwdPlanUuid() {
        return fwdPlanUuid;
    }

    public FwdPlan setFwdPlanUuid(String fwdPlanUuid) {
        this.fwdPlanUuid = fwdPlanUuid;
        return this;
    }
    public String getPlanName() {
        return planName;
    }

    public FwdPlan setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanCode() {
        return planCode;
    }

    public FwdPlan setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }

    public FwdPlan setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public FwdPlan setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }

    public FwdPlan setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getBussType() {
        return bussType;
    }

    public FwdPlan setBussType(String bussType) {
        this.bussType = bussType;
        return this;
    }
    public String getBussTypeName() {
        return bussTypeName;
    }

    public FwdPlan setBussTypeName(String bussTypeName) {
        this.bussTypeName = bussTypeName;
        return this;
    }
    public String getPlanStatus() {
        return planStatus;
    }

    public FwdPlan setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
        return this;
    }
    public Boolean getIsLock() {
        return isLock;
    }

    public FwdPlan setIsLock(Boolean isLock) {
        this.isLock = isLock;
        return this;
    }
    public String getCompanyUuid() {
        return companyUuid;
    }

    public FwdPlan setCompanyUuid(String companyUuid) {
        this.companyUuid = companyUuid;
        return this;
    }
    public String getVdef1() {
        return vdef1;
    }

    public FwdPlan setVdef1(String vdef1) {
        this.vdef1 = vdef1;
        return this;
    }
    public String getVdef2() {
        return vdef2;
    }

    public FwdPlan setVdef2(String vdef2) {
        this.vdef2 = vdef2;
        return this;
    }
    public String getVdef3() {
        return vdef3;
    }

    public FwdPlan setVdef3(String vdef3) {
        this.vdef3 = vdef3;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.fwdPlanUuid;
    }

    @Override
    public String toString() {
        return "FwdPlan{" +
            "fwdPlanUuid=" + fwdPlanUuid +
            ", planName=" + planName +
            ", planCode=" + planCode +
            ", modelCode=" + modelCode +
            ", modelName=" + modelName +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", bussType=" + bussType +
            ", bussTypeName=" + bussTypeName +
            ", planStatus=" + planStatus +
            ", isLock=" + isLock +
            ", companyUuid=" + companyUuid +
            ", vdef1=" + vdef1 +
            ", vdef2=" + vdef2 +
            ", vdef3=" + vdef3 +
        "}";
    }

}
