package com.ztax.prospect.poi.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.ztax.common.poi.converter.LocalDateTimeConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * <p>
 * 违约率数据
 * 导入导出实体
 * </p>
 */

@Data//生成get、set方法
@NoArgsConstructor//生成无参构造
@AllArgsConstructor//生成有参构造
public class FwdDefRateForPoi {

    /**
     * 期数
     */
    @ExcelProperty(value = "期数", index = 0)
    private String periodNum;

    /**
     * 数据开始日期
     */
    @ExcelProperty(value = "数据开始日期", index = 1, converter = LocalDateTimeConverter.class)
    private LocalDateTime startDate;

    /**
     * 数据结束日期
     */
    @ExcelProperty(value = "数据结束日期", index = 2, converter = LocalDateTimeConverter.class)
    private LocalDateTime endDate;

    /**
     * 违约客户数
     */
    @ExcelProperty(value = "违约客户数", index = 3)
    private String defaultNum;

    /**
     * 正常客户数
     */
    @ExcelProperty(value = "正常客户数", index = 4)
    private String normalNum;

    /**
     * 合计客户数
     */
    @ExcelProperty(value = "合计客户数", index = 5)
    private String sumNum;

    /**
     * 违约率
     */
    @ExcelProperty(value = "违约率", index = 6)
    private String defRate;
}
