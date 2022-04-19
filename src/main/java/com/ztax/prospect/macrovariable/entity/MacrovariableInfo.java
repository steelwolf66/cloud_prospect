package com.ztax.prospect.macrovariable.entity;

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
 * @since 2022-04-19
 */
@TableName("macrovariable_info")
public class MacrovariableInfo extends Model<MacrovariableInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "info_uuid", type = IdType.UUID)
    private String infoUuid;

    /**
     * 宏观变量编码
     */
    @TableField("macrovariable_code")
    private String macrovariableCode;

    /**
     * 宏观变量名称
     */
    @TableField("macrovariable_name")
    private String macrovariableName;

    public String getInfoUuid() {
        return infoUuid;
    }

    public MacrovariableInfo setInfoUuid(String infoUuid) {
        this.infoUuid = infoUuid;
        return this;
    }
    public String getMacrovariableCode() {
        return macrovariableCode;
    }

    public MacrovariableInfo setMacrovariableCode(String macrovariableCode) {
        this.macrovariableCode = macrovariableCode;
        return this;
    }
    public String getMacrovariableName() {
        return macrovariableName;
    }

    public MacrovariableInfo setMacrovariableName(String macrovariableName) {
        this.macrovariableName = macrovariableName;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.infoUuid;
    }

    @Override
    public String toString() {
        return "MacrovariableInfo{" +
            "infoUuid=" + infoUuid +
            ", macrovariableCode=" + macrovariableCode +
            ", macrovariableName=" + macrovariableName +
        "}";
    }

}
