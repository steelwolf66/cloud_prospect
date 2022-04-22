package com.ztax.prospect.fwd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
    * 违约率数据表
    * </p>
 *
 * @since 2022-04-20
 */
@TableName("fwd_def_rate")
public class FwdDefRate extends Model<FwdDefRate> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "def_rate_uuid", type = IdType.UUID)
    private String defRateUuid;

    @TableField("period_num")
    private String periodNum;

    @TableField("start_date")
    private LocalDateTime startDate;

    @TableField("end_date")
    private LocalDateTime endDate;

    /**
     * 违约客户数
     */
    @TableField("default_num")
    private String defaultNum;

    /**
     * 正常客户数
     */
    @TableField("normal_num")
    private String normalNum;

    /**
     * 合计客户数
     */
    @TableField("sum_num")
    private String sumNum;

    /**
     * 违约率
     */
    @TableField("def_rate")
    private String defRate;

    @TableField("fwd_plan_uuid")
    private String fwdPlanUuid;

    @TableField("company_uuid")
    private String companyUuid;

    public String getDefRateUuid() {
        return defRateUuid;
    }

    public FwdDefRate setDefRateUuid(String defRateUuid) {
        this.defRateUuid = defRateUuid;
        return this;
    }
    public String getPeriodNum() {
        return periodNum;
    }

    public FwdDefRate setPeriodNum(String periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public FwdDefRate setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }

    public FwdDefRate setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getDefaultNum() {
        return defaultNum;
    }

    public FwdDefRate setDefaultNum(String defaultNum) {
        this.defaultNum = defaultNum;
        return this;
    }
    public String getNormalNum() {
        return normalNum;
    }

    public FwdDefRate setNormalNum(String normalNum) {
        this.normalNum = normalNum;
        return this;
    }
    public String getSumNum() {
        return sumNum;
    }

    public FwdDefRate setSumNum(String sumNum) {
        this.sumNum = sumNum;
        return this;
    }
    public String getDefRate() {
        return defRate;
    }

    public FwdDefRate setDefRate(String defRate) {
        this.defRate = defRate;
        return this;
    }
    public String getFwdPlanUuid() {
        return fwdPlanUuid;
    }

    public FwdDefRate setFwdPlanUuid(String fwdPlanUuid) {
        this.fwdPlanUuid = fwdPlanUuid;
        return this;
    }
    public String getCompanyUuid() {
        return companyUuid;
    }

    public FwdDefRate setCompanyUuid(String companyUuid) {
        this.companyUuid = companyUuid;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.defRateUuid;
    }

    @Override
    public String toString() {
        return "FwdDefRate{" +
            "defRateUuid=" + defRateUuid +
            ", periodNum=" + periodNum +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", defaultNum=" + defaultNum +
            ", normalNum=" + normalNum +
            ", sumNum=" + sumNum +
            ", defRate=" + defRate +
            ", fwdPlanUuid=" + fwdPlanUuid +
            ", companyUuid=" + companyUuid +
        "}";
    }

}
