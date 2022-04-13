package com.ztax.prospect.wilson.controller;

import com.ejlchina.okhttps.HttpResult;
import com.ejlchina.okhttps.HttpUtils;
import com.ztax.common.result.Result;
import com.ztax.common.utils.JsonUtils;
import com.ztax.prospect.wilson.entity.Macrovariable;
import com.ztax.prospect.wilson.entity.Pd;
import com.ztax.prospect.wilson.entity.Relativity;
import com.ztax.prospect.wilson.entity.WilsonParamEntity;
import com.ztax.prospect.wilson.service.impl.WilsonRemoteServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@Slf4j
public class WilsonRemoteController {

    @Autowired
    private WilsonRemoteServiceImpl wilsonRemoteService;

    /**
     * 威尔逊模型远程调试
     *
     * @return
     */
    @GetMapping(value = "/wilson")
    public Result remoteWilson() {
        //构建参数体
        WilsonParamEntity wilsonParamEntity = wilsonRemoteService.loadWilsonParamEntity();

        RestTemplate template = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
        HashMap paramMap = new HashMap();
        ResponseEntity<Map> mapResponseEntity = template
                .postForEntity("http://103.79.202.131:31000/wilson/wilson_equation", wilsonParamEntity, Map.class, paramMap);

        HttpResult postResult = HttpUtils.sync("http://103.79.202.131:31000/wilson/wilson_equation")
                .setBodyPara(wilsonParamEntity)
                .post();

        log.info("param json :{}", JsonUtils.toString(wilsonParamEntity));

        log.info("restTemplate :{}", mapResponseEntity.getBody());
        log.info("okHttps :{}", postResult.getBody());
        return Result.success(mapResponseEntity.getBody());
    }

}