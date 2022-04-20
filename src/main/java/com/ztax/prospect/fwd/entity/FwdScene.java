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
@TableName("fwd_scene")
public class FwdScene extends Model<FwdScene> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "scene_uuid", type = IdType.UUID)
    private String sceneUuid;

    @TableField("fwd_plan_uuid")
    private String fwdPlanUuid;

    @TableField("company_uuid")
    private String companyUuid;

    @TableField("very_optimism")
    private BigDecimal veryOptimism;

    @TableField("optimism")
    private BigDecimal optimism;

    @TableField("base")
    private BigDecimal base;

    @TableField("pessimism")
    private BigDecimal pessimism;

    @TableField("very_pessimism")
    private BigDecimal veryPessimism;

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

    public String getSceneUuid() {
        return sceneUuid;
    }

    public FwdScene setSceneUuid(String sceneUuid) {
        this.sceneUuid = sceneUuid;
        return this;
    }
    public String getFwdPlanUuid() {
        return fwdPlanUuid;
    }

    public FwdScene setFwdPlanUuid(String fwdPlanUuid) {
        this.fwdPlanUuid = fwdPlanUuid;
        return this;
    }
    public String getCompanyUuid() {
        return companyUuid;
    }

    public FwdScene setCompanyUuid(String companyUuid) {
        this.companyUuid = companyUuid;
        return this;
    }
    public BigDecimal getVeryOptimism() {
        return veryOptimism;
    }

    public FwdScene setVeryOptimism(BigDecimal veryOptimism) {
        this.veryOptimism = veryOptimism;
        return this;
    }
    public BigDecimal getOptimism() {
        return optimism;
    }

    public FwdScene setOptimism(BigDecimal optimism) {
        this.optimism = optimism;
        return this;
    }
    public BigDecimal getBase() {
        return base;
    }

    public FwdScene setBase(BigDecimal base) {
        this.base = base;
        return this;
    }
    public BigDecimal getPessimism() {
        return pessimism;
    }

    public FwdScene setPessimism(BigDecimal pessimism) {
        this.pessimism = pessimism;
        return this;
    }
    public BigDecimal getVeryPessimism() {
        return veryPessimism;
    }

    public FwdScene setVeryPessimism(BigDecimal veryPessimism) {
        this.veryPessimism = veryPessimism;
        return this;
    }
    public String getCreateId() {
        return createId;
    }

    public FwdScene setCreateId(String createId) {
        this.createId = createId;
        return this;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public FwdScene setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getUpdateId() {
        return updateId;
    }

    public FwdScene setUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public FwdScene setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getDeleteId() {
        return deleteId;
    }

    public FwdScene setDeleteId(String deleteId) {
        this.deleteId = deleteId;
        return this;
    }
    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public FwdScene setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }
    public Integer getDelFlg() {
        return delFlg;
    }

    public FwdScene setDelFlg(Integer delFlg) {
        this.delFlg = delFlg;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.sceneUuid;
    }

    @Override
    public String toString() {
        return "FwdScene{" +
            "sceneUuid=" + sceneUuid +
            ", fwdPlanUuid=" + fwdPlanUuid +
            ", companyUuid=" + companyUuid +
            ", veryOptimism=" + veryOptimism +
            ", optimism=" + optimism +
            ", base=" + base +
            ", pessimism=" + pessimism +
            ", veryPessimism=" + veryPessimism +
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
