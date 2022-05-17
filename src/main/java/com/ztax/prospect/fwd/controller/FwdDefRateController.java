package com.ztax.prospect.fwd.controller;

import com.ztax.common.exception.BizException;
import com.ztax.common.result.Result;
import com.ztax.common.utils.HttpUtils;
import com.ztax.common.utils.ThreadLocalUtils;
import com.ztax.prospect.fwd.entity.FwdDefRate;
import com.ztax.prospect.fwd.service.impl.FwdDefRateServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Slf4j
@RestController
@RequestMapping("/fwd/def/rate")
public class FwdDefRateController {
    @Autowired
    private FwdDefRateServiceImpl FwdDefRateService;

    /**
     * 违约率模板下载
     */
    @GetMapping("/model")
    public void downLoadModel() {
        InputStream in = null;
        OutputStream out = null;

        HttpServletResponse response = HttpUtils.getResponse();
        try {
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment;fileName=" + new String("model.xlsx"));
            out = response.getOutputStream();
            in = this.getClass().getClassLoader().getResourceAsStream("fileTemplates/" + "违约率模板.xlsx");
            int ch;
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
        } catch (Exception e) {
            log.error("downLoad model exception:", e);
            throw new BizException("下载模板失败");
        } finally {
            try {

                in.close();
                out.close();
            } catch (Exception e) {
                log.error("close input/output stream exception:", e);
            }
        }
    }

    /**
     * 违约率数据导入
     * @param file 导入文件
     * @param paramBean 参数实体
     * @return
     */
    @PostMapping("/in")
    public Result importData(MultipartFile file) {
        //todo 使用threadLocal传递参数
        ThreadLocalUtils.set("testKey","testValue");
        try {
            FwdDefRateService.importData(file);
        } catch (IOException e) {
            log.error("import data exception", e);
            throw new BizException("导入数据异常");
        }finally {
            ThreadLocalUtils.remove();
        }

        return Result.success();
    }

    /**
     * 违约率数据导出
     * @param paramBean 参数实体
     * @return
     */
    @PostMapping("/out")
    public void exportData(@RequestBody FwdDefRate paramBean) {
        try {
            FwdDefRateService.exportData(paramBean);
        } catch (IOException e) {
            log.error("import data exception", e);
            throw new BizException("导出数据异常");
        }
        return ;
    }
}