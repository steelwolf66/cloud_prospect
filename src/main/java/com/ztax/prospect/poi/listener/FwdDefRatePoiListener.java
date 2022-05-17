package com.ztax.prospect.poi.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.google.common.collect.Lists;
import com.ztax.common.exception.BizException;
import com.ztax.common.utils.ObjectUtils;
import com.ztax.common.utils.ThreadLocalUtils;
import com.ztax.common.utils.UuidUtil;
import com.ztax.prospect.fwd.entity.FwdDefRate;
import com.ztax.prospect.fwd.service.impl.FwdDefRateServiceImpl;
import com.ztax.prospect.poi.entity.FwdDefRateForPoi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class FwdDefRatePoiListener extends AnalysisEventListener<FwdDefRateForPoi> {
    @Autowired
    private FwdDefRateServiceImpl fwdDefRateService;

    private List<FwdDefRateForPoi> dataList = Lists.newArrayList();

    /**
     * 解析每条数据时都会调用
     */
    @Override
    public void invoke(FwdDefRateForPoi fwdDefRate, AnalysisContext context) {
        dataList.add(fwdDefRate);
    }

    /**
     * 所有数据解析完之后调用
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        List<FwdDefRate> listDto = Lists.newArrayList();
        if (ObjectUtils.isBlank(dataList)) {
            throw new BizException("导入数据为空");
        }
        //copy属性，并设置相关属性
        for (FwdDefRateForPoi item : dataList) {
            FwdDefRate fwdDefRate = new FwdDefRate();
            BeanUtils.copyProperties(item, fwdDefRate);

            //设置主键
            fwdDefRate.setDefRateUuid(UuidUtil.get32Uuid());
            //todo 设置公司等属性（从httpRequest中获取或者从threadLocal中获取）
            String testValue = (String)ThreadLocalUtils.get("testKey");
            listDto.add(fwdDefRate);
        }
        // 可以在此处执行业务操作
//        fwdDefRateService.saveBatch(listDto);
    }


}
