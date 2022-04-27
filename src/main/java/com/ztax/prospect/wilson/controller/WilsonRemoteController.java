package com.ztax.prospect.wilson.controller;

import com.ztax.common.result.Result;
import com.ztax.common.utils.JsonUtils;
import com.ztax.prospect.wilson.entity.request.WilsonParamEntity;
import com.ztax.prospect.wilson.entity.response.ResponseFromWG;
import com.ztax.prospect.wilson.service.impl.WilsonRemoteServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

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

    @GetMapping(value = "/wilson/{planUuid}")
    public Result remoteWilsonByDB(@PathVariable("planUuid") String planUuid) {
        WilsonParamEntity wilsonParamEntity = wilsonRemoteService.loadParamEntityFromDB(planUuid);
        log.info("wilsonParamEntityString:{}", wilsonParamEntity);
        HashMap paramMap = new HashMap();

        RestTemplate template = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
        ResponseEntity<String> responseEntity = template.postForEntity("http://103.79.202.131:31000/wilson/wilson_equation", wilsonParamEntity, String.class, paramMap);
        log.info("response:{}", responseEntity.getBody());

        return Result.success(wilsonParamEntity);
    }

    @GetMapping(value = "/wilson/remote/{planUuid}")
    public Result calculateByRemote(@PathVariable("planUuid") String planUuid) {
        CompletableFuture.supplyAsync(() -> {
            return wilsonRemoteService.asyncCallRemote(planUuid);
        }).thenAcceptAsync(result -> {
            log.info("result:{}", result);
        }).handleAsync((res, ex) -> {
            if (ex != null) {
                log.error("call remote calculate exception ", ex);
            }
            return res;
        });
        log.info("calculating");
        return Result.success();
    }
}