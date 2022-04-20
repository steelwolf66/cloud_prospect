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
@TableName("fwd_macro_info")
public class FwdMacroInfo extends Model<FwdMacroInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "info_uuid", type = IdType.UUID)
    private String infoUuid;

    /**
     * 宏观变量编码
     */
    @TableField("macro_code")
    private String macroCode;

    /**
     * 宏观变量名称
     */
    @TableField("macro_name")
    private String macroName;

    public String getInfoUuid() {
        return infoUuid;
    }

    public FwdMacroInfo setInfoUuid(String infoUuid) {
        this.infoUuid = infoUuid;
        return this;
    }
    public String getMacroCode() {
        return macroCode;
    }

    public FwdMacroInfo setMacroCode(String macroCode) {
        this.macroCode = macroCode;
        return this;
    }
    public String getMacroName() {
        return macroName;
    }

    public FwdMacroInfo setMacroName(String macroName) {
        this.macroName = macroName;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.infoUuid;
    }

    @Override
    public String toString() {
        return "FwdMacroInfo{" +
            "infoUuid=" + infoUuid +
            ", macroCode=" + macroCode +
            ", macroName=" + macroName +
        "}";
    }

}
