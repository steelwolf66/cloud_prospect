package com.ztax.prospect.wilson.service.impl;

import com.ztax.common.utils.JsonUtils;
import com.ztax.prospect.wilson.entity.Macrovariable;
import com.ztax.prospect.wilson.entity.Pd;
import com.ztax.prospect.wilson.entity.Relativity;
import com.ztax.prospect.wilson.entity.WilsonParamEntity;
import com.ztax.prospect.wilson.service.WilsonRemoteService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class WilsonRemoteServiceImpl implements WilsonRemoteService {
    @Override
    public WilsonParamEntity loadWilsonParamEntity() {
        WilsonParamEntity paramEntityFromJson = getParamEntityFromJson();
//        WilsonParamEntity paramEntityByM = getParamEntityByManual();
        return paramEntityFromJson;
    }

    private WilsonParamEntity getParamEntityByManual() {
        WilsonParamEntity wilsonParamEntity = new WilsonParamEntity();
        wilsonParamEntity.setUuid("e010fb79e69213a9acd0f225888cfc19");

        Pd pd = new Pd();
        pd.setEndDate("2020-01-02");
        pd.setPd(BigDecimal.valueOf(0.56));

        wilsonParamEntity.setPdList(Arrays.asList(pd));
        wilsonParamEntity.setpValue(BigDecimal.valueOf(0.12));
        wilsonParamEntity.setR2(BigDecimal.valueOf(0.1));
        wilsonParamEntity.setVifType(0);
        wilsonParamEntity.setEquationPValue(BigDecimal.valueOf(0.05));
        wilsonParamEntity.setEquationR2(BigDecimal.valueOf(0.5));
        wilsonParamEntity.setVifValue(BigDecimal.valueOf(10));
        wilsonParamEntity.setModelType(0);
        wilsonParamEntity.setSlentry(BigDecimal.valueOf(0.15));
        wilsonParamEntity.setSlstay(BigDecimal.valueOf(0.15));
        Relativity relativity = new Relativity();
        relativity.setX1(BigDecimal.valueOf(1));
        relativity.setX2(BigDecimal.valueOf(-1));
        relativity.setX3(BigDecimal.valueOf(1));
        relativity.setX4(BigDecimal.valueOf(-1));
        relativity.setX5(BigDecimal.valueOf(1));
        wilsonParamEntity.setRelativity(relativity);

        Macrovariable macrovariable = new Macrovariable();
        macrovariable.setDataDate("2020-02-21");
        macrovariable.setValue(BigDecimal.valueOf(0.54));
        HashMap<String, List<Macrovariable>> objectMap = new HashMap<>();
        objectMap.put("x1", Arrays.asList(macrovariable));
        wilsonParamEntity.setMacrovariableList(Arrays.asList(objectMap));
        return wilsonParamEntity;
    }

    private WilsonParamEntity getParamEntityFromJson() {
        String paramJson = "{\n" +
                "    \"uuid\": \"e010fb79e69213a9acd0f225888cfc19\",\n" +
                "    \"pdList\": [\n" +
                "        {\n" +
                "            \"endDate\": \"2021-01-31\", \"pd\": \"0.031\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"endDate\": \"2021-03-31\", \"pd\": \"0.041\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"macrovariableList\": [\n" +
                "        {\n" +
                "            \"x1\": [\n" +
                "                {\n" +
                "                    \"dataDate\": \"2021-01-31\",\"value\": \"0.7\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"dataDate\": \"2021-03-31\",\"value\": \"0.6\"\n" +
                "                }\n" +
                "            ],\n" +
                "\t\t\t\"x2\": [\n" +
                "                {\n" +
                "                    \"dataDate\": \"2021-01-31\",\"value\": \"0.5\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"dataDate\": \"2021-03-31\",\"value\": \"0.8\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"pValue\": \"0.12\",\n" +
                "    \"r2\": \"0.23\",\n" +
                "    \"equationPValue\": \"0.34\",\n" +
                "    \"equationR2\": \"0.41\",\n" +
                "    \"vifType\": \"1\",\n" +
                "    \"vifValue\": \"0.41\",\n" +
                "    \"modelType\": \"2\",\n" +
                "    \"slentry\": \"1.12345678\",\n" +
                "    \"slstay\": \"2.12345678\",\n" +
                "    \"relativity\": \n" +
                "        { \n" +
                "\t\t\"x1\": \"1\",\"x2\": \"-1\",\"x3\": \"-1\",\"x4\": \"-1\",\"x5\": \"1\"\n" +
                "        }\n" +
                "    \n" +
                "}";

        WilsonParamEntity entityFromJson = JsonUtils.toBean(paramJson, WilsonParamEntity.class);
        return entityFromJson;
    }
}
