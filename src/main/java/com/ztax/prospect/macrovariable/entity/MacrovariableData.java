package com.ztax.prospect.macrovariable.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
    * 
    * </p>
 *
 * @since 2022-04-19
 */
@TableName("macrovariable_data")
public class MacrovariableData extends Model<MacrovariableData> {

    private static final long serialVersionUID = 1L;

    @TableField("data_uuid")
    private String dataUuid;

    @TableField("info_uuid")
    private String infoUuid;

    /**
     * 数据日期
     */
    @TableField("data_date")
    private LocalDateTime dataDate;

    /**
     * P值
     */
    @TableField("pd_value")
    private BigDecimal pdValue;

    public String getDataUuid() {
        return dataUuid;
    }

    public MacrovariableData setDataUuid(String dataUuid) {
        this.dataUuid = dataUuid;
        return this;
    }
    public String getInfoUuid() {
        return infoUuid;
    }

    public MacrovariableData setInfoUuid(String infoUuid) {
        this.infoUuid = infoUuid;
        return this;
    }
    public LocalDateTime getDataDate() {
        return dataDate;
    }

    public MacrovariableData setDataDate(LocalDateTime dataDate) {
        this.dataDate = dataDate;
        return this;
    }
    public BigDecimal getPdValue() {
        return pdValue;
    }

    public MacrovariableData setPdValue(BigDecimal pdValue) {
        this.pdValue = pdValue;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "MacrovariableData{" +
            "dataUuid=" + dataUuid +
            ", infoUuid=" + infoUuid +
            ", dataDate=" + dataDate +
            ", pdValue=" + pdValue +
        "}";
    }

}
