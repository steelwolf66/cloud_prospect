package com.ztax.prospect.fwd.entity;

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
@TableName("fwd_plan")
public class FwdPlan extends Model<FwdPlan> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fwd_plan_uuid", type = IdType.UUID)
    private String fwdPlanUuid;

    @TableField("plan_name")
    private String planName;

    @TableField("plan_code")
    private String planCode;

    @TableField("model_name")
    private String modelName;

    @TableField("start_date")
    private LocalDateTime startDate;

    @TableField("end_date")
    private LocalDateTime endDate;

    @TableField("buss_type")
    private String bussType;

    @TableField("buss_type_name")
    private String bussTypeName;

    @TableField("plan_status")
    private String planStatus;

    @TableField("is_lock")
    private String isLock;

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
    public String getIsLock() {
        return isLock;
    }

    public FwdPlan setIsLock(String isLock) {
        this.isLock = isLock;
        return this;
    }
    public String getCreateId() {
        return createId;
    }

    public FwdPlan setCreateId(String createId) {
        this.createId = createId;
        return this;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public FwdPlan setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getUpdateId() {
        return updateId;
    }

    public FwdPlan setUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public FwdPlan setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getDeleteId() {
        return deleteId;
    }

    public FwdPlan setDeleteId(String deleteId) {
        this.deleteId = deleteId;
        return this;
    }
    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public FwdPlan setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }
    public Boolean getDelFlg() {
        return delFlg;
    }

    public FwdPlan setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
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
            ", modelName=" + modelName +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", bussType=" + bussType +
            ", bussTypeName=" + bussTypeName +
            ", planStatus=" + planStatus +
            ", isLock=" + isLock +
            ", createId=" + createId +
            ", createTime=" + createTime +
            ", updateId=" + updateId +
            ", updateTime=" + updateTime +
            ", deleteId=" + deleteId +
            ", deleteTime=" + deleteTime +
            ", delFlg=" + delFlg +
            ", companyUuid=" + companyUuid +
            ", vdef1=" + vdef1 +
            ", vdef2=" + vdef2 +
            ", vdef3=" + vdef3 +
        "}";
    }

}
