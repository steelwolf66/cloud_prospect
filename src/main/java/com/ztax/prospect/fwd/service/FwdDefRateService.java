package com.ztax.prospect.fwd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ztax.prospect.fwd.entity.FwdDefRate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * <p>
    * 违约率数据表 服务类
    * </p>
 *
 * @since 2022-04-20
 */
public interface FwdDefRateService extends IService<FwdDefRate> {

    void exportData(FwdDefRate paramBean) throws IOException;

    void importData(MultipartFile file) throws IOException;
}
