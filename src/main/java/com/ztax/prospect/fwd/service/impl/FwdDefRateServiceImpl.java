package com.ztax.prospect.fwd.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.ztax.common.exception.BizException;
import com.ztax.common.utils.HttpUtils;
import com.ztax.common.utils.ObjectUtils;
import com.ztax.prospect.fwd.entity.FwdDefRate;
import com.ztax.prospect.fwd.mapper.FwdDefRateMapper;
import com.ztax.prospect.fwd.service.FwdDefRateService;
import com.ztax.prospect.poi.entity.FwdDefRateForPoi;
import com.ztax.prospect.poi.listener.FwdDefRatePoiListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 违约率数据表 服务实现类
 * </p>
 *
 * @since 2022-04-20
 */
@Service
public class FwdDefRateServiceImpl extends ServiceImpl<FwdDefRateMapper, FwdDefRate> implements FwdDefRateService {
    @Autowired
    private FwdDefRateMapper defRateMapper;

    /**
     * 导出数据
     *
     * @param paramBean
     * @throws IOException
     */
    @Override
    public void exportData(FwdDefRate paramBean) throws IOException {
        HttpServletResponse response = HttpUtils.getResponse();
        String fileName = URLEncoder.encode("表名-" + new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date()), "UTF-8");
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        ExcelWriter excelWriter = EasyExcelFactory.write(response.getOutputStream()).build();

        ////todo 查询条件
        QueryWrapper<FwdDefRate> queryWrapper = new QueryWrapper<>();

        List<FwdDefRate> fwdDefRateList = defRateMapper.selectList(queryWrapper);

        if (ObjectUtils.isBlank(fwdDefRateList)) {
            throw new BizException("无数据可以导出");
        }

        //转换格式
        List<FwdDefRateForPoi> dataForExport = Lists.newArrayList();
        for (FwdDefRate item : fwdDefRateList) {
            FwdDefRateForPoi dataForPoi = new FwdDefRateForPoi();
            BeanUtils.copyProperties(item, dataForPoi);
            dataForExport.add(dataForPoi);
        }
        excelWriter.write(dataForExport, EasyExcelFactory.writerSheet(0, "历史违约信息").head(FwdDefRateForPoi.class).build());
        excelWriter.finish();
    }

    /**
     * 导入数据
     *
     * @param file
     * @throws IOException
     */
    @Override
    public void importData(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), FwdDefRateForPoi.class, new FwdDefRatePoiListener())
                .sheet()
                .doRead();
    }


}

