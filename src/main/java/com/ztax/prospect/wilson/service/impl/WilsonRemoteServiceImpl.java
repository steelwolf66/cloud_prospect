package com.ztax.prospect.wilson.service.impl;

import com.ztax.common.utils.JsonUtils;
import com.ztax.prospect.wilson.entity.Macrovariable;
import com.ztax.prospect.wilson.entity.Pd;
import com.ztax.prospect.wilson.entity.WilsonParamEntity;
import com.ztax.prospect.wilson.service.WilsonRemoteService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WilsonRemoteServiceImpl implements WilsonRemoteService {
    @Override
    public WilsonParamEntity loadWilsonParamEntity() {
//        WilsonParamEntity paramEntityFromJson = getParamEntityFromJson();
        WilsonParamEntity paramEntityByM = getParamEntityByManual();
        return paramEntityByM;
    }

    private WilsonParamEntity getParamEntityByManual() {
        WilsonParamEntity wilsonParamEntity = new WilsonParamEntity();
        wilsonParamEntity.setUuid("e010fb79e69213a9acd0f225888cfc19");

        Pd pd1 = new Pd();
        pd1.setEndDate("2021-01-31");
        pd1.setPd("0.031");

        Pd pd2 = new Pd();
        pd2.setEndDate("2021-03-31");
        pd2.setPd("0.041");

        wilsonParamEntity.setPdList(Arrays.asList(pd1, pd2));
        wilsonParamEntity.setpValue("0.12");
        wilsonParamEntity.setR2("0.23");
        wilsonParamEntity.setVifType("1");
        wilsonParamEntity.setEquationPValue("0.34");
        wilsonParamEntity.setEquationR2("0.41");
        wilsonParamEntity.setVifValue("0.41");
        wilsonParamEntity.setModelType("2");
        wilsonParamEntity.setSlentry("1.12345678");
        wilsonParamEntity.setSlstay("2.12345678");
        Map<String,String> relativity = new HashMap<>();
        relativity.put("X1","1");
        relativity.put("X2","-1");
        relativity.put("X3","-1");
        relativity.put("X4","-1");
        relativity.put("X5","1");
        wilsonParamEntity.setRelativity(relativity);
        HashMap<String, List<Macrovariable>> objectMap = new HashMap<>();
        Macrovariable macrovariable1 = new Macrovariable();
        macrovariable1.setDataDate("2021-01-31");
        macrovariable1.setMacroValue("0.7");

        Macrovariable macrovariable2 = new Macrovariable();
        macrovariable2.setDataDate("2021-03-31");
        macrovariable2.setMacroValue("0.6");

        Macrovariable macrovariable3 = new Macrovariable();
        macrovariable3.setDataDate("2021-01-31");
        macrovariable3.setMacroValue("0.5");

        Macrovariable macrovariable4 = new Macrovariable();
        macrovariable4.setDataDate("2021-03-31");
        macrovariable4.setMacroValue("0.8");
        List<Macrovariable> list1 = new ArrayList<>();
        list1.add(macrovariable1);
        list1.add(macrovariable2);
        List<Macrovariable> list2 = new ArrayList<>();
        list2.add(macrovariable3);
        list2.add(macrovariable4);
        objectMap.put("X1", list1);
        objectMap.put("X2", list2);
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
                "                    \"dataDate\": \"2021-01-31\",\"Value\": \"0.7\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"dataDate\": \"2021-03-31\",\"Value\": \"0.6\"\n" +
                "                }\n" +
                "            ],\n" +
                "\t\t\t\"x2\": [\n" +
                "                {\n" +
                "                    \"dataDate\": \"2021-01-31\",\"Value\": \"0.5\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"dataDate\": \"2021-03-31\",\"Value\": \"0.8\"\n" +
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
