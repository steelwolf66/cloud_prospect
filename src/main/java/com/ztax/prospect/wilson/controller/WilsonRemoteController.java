package com.ztax.prospect.wilson.controller;

import com.ztax.common.result.Result;
import com.ztax.common.utils.JsonUtils;
import com.ztax.prospect.wilson.entity.WilsonParamEntity;
import com.ztax.prospect.wilson.entity.response.ResponseFromWG;
import com.ztax.prospect.wilson.service.impl.WilsonRemoteServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

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
        String paraString = JsonUtils.toString(wilsonParamEntity);
        log.info("param json :{}", paraString);
        HashMap paramMap = new HashMap();

        ResponseEntity<String> responseEntity = template.postForEntity("http://103.79.202.131:31000/wilson/wilson_equation", wilsonParamEntity, String.class, paramMap);

        String responseString = "{\n" +
                "    \"message\": \"单变量分析无保留变量\",\n" +
                "    \"unanalysisList\": [\n" +
                "        {\n" +
                "            \"all_var_params\": {\n" +
                "                \"X1\": {\n" +
                "                    \"coef\": -2.8995839922648905,\n" +
                "                    \"p_value\":\"NaN\",\n" +
                "                    \"rsquared\": 1.0\n" +
                "                },\n" +
                "                \"X2\": {\n" +
                "                    \"coef\": 0.9665279974216325,\n" +
                "                    \"p_value\":\"NaN\",\n" +
                "                    \"rsquared\": 1.0\n" +
                "                }\n" +
                "            },\n" +
                "            \"saved_var_name\": []\n" +
                "        }\n" +
                "    ],\n" +
                "    \"uuid\": \"e010fb79e69213a9acd0f225888cfc19\"\n" +
                "}";

        log.info("response:{}", responseEntity.getBody());
        ResponseFromWG responseFromWG = JsonUtils.toBean(responseString, ResponseFromWG.class);
        log.info("body  :{}", responseFromWG.toString());
        return Result.success(responseEntity.getBody());
    }

}