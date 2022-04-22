package com.ztax.prospect.wilson.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ztax.common.utils.JsonUtils;
import com.ztax.prospect.fwd.entity.*;
import com.ztax.prospect.fwd.service.impl.*;
import com.ztax.prospect.wilson.entity.Macrovariable;
import com.ztax.prospect.wilson.entity.Pd;
import com.ztax.prospect.wilson.entity.WilsonParamEntity;
import com.ztax.prospect.wilson.service.WilsonRemoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Slf4j
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
        Map<String, String> relativity = new HashMap<>();
        relativity.put("X1", "1");
        relativity.put("X2", "-1");
        relativity.put("X3", "-1");
        relativity.put("X4", "-1");
        relativity.put("X5", "1");
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

    @Autowired
    private FwdWilsonParamServiceImpl fwdWilsonParamService;
    @Autowired
    private FwdPlanServiceImpl fwdPlanService;
    @Autowired
    private FwdDefRateServiceImpl fwdDefRateService;
    @Autowired
    private FwdMacroDepServiceImpl fwdMacroDepService;
    @Autowired
    private FwdMacroDataServiceImpl fwdMacroDataService;
    @Autowired
    private FwdMacroInfoServiceImpl fwdMacroInfoService;

    @Override
    public WilsonParamEntity loadParamEntityFromDB(String planUuid) {
        WilsonParamEntity wilsonParamEntity = new WilsonParamEntity();
        //查询方案实体
        FwdPlan fwdPlan = fwdPlanService.getById(planUuid);
        //通过planUUID查询，威尔逊模型参数主体
        QueryWrapper<FwdWilsonParam> wilsonParamQueryWrapper = new QueryWrapper<>();
        wilsonParamQueryWrapper.eq("fwd_plan_uuid", planUuid);
        FwdWilsonParam fwdWilsonParamById = fwdWilsonParamService.getOne(wilsonParamQueryWrapper);
        //设置对象值
        wilsonParamEntity.setUuid(fwdWilsonParamById.getParamUuid());
        wilsonParamEntity.setpValue(String.valueOf(fwdWilsonParamById.getPdValue()));
        wilsonParamEntity.setVifType(String.valueOf(fwdWilsonParamById.getVifType()));
        wilsonParamEntity.setVifValue(String.valueOf(fwdWilsonParamById.getVifValue()));
        wilsonParamEntity.setSlentry(String.valueOf(fwdWilsonParamById.getSlentry()));
        wilsonParamEntity.setSlstay(String.valueOf(fwdWilsonParamById.getSlstay()));
        wilsonParamEntity.setR2(String.valueOf(fwdWilsonParamById.getSingleRSquare()));
        wilsonParamEntity.setModelType(String.valueOf(fwdWilsonParamById.getModelEntryType()));
        wilsonParamEntity.setEquationPValue(String.valueOf(fwdWilsonParamById.getRegressPdValue()));
        wilsonParamEntity.setEquationR2(String.valueOf(fwdWilsonParamById.getRegressRSquare()));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //构建Pd
        //Pd
        List<Pd> pdList = new ArrayList<>();
        QueryWrapper<FwdDefRate> fwdDefRateQueryWrapper = new QueryWrapper<>();
        fwdDefRateQueryWrapper.eq("fwd_plan_uuid", planUuid);
        List<FwdDefRate> fwdDefRateList = fwdDefRateService.list(fwdDefRateQueryWrapper);
        fwdDefRateList.stream()
                .sorted(Comparator.comparing(FwdDefRate::getEndDate))
                .forEach(item -> {
                    Pd pd = new Pd();
                    pd.setEndDate(item.getEndDate().format(df));
                    pd.setPd(BigDecimal.valueOf(Double.valueOf(item.getDefRate())).divide(BigDecimal.valueOf(100),6, RoundingMode.HALF_UP).toString());
                    pdList.add(pd);
                });
        wilsonParamEntity.setPdList(pdList);

        //Relativity 正负相关(无需排序)
        QueryWrapper<FwdMacroDep> fwdMacroDepQueryWrapper = new QueryWrapper<>();
        fwdMacroDepQueryWrapper.eq("fwd_plan_uuid", planUuid)
        .orderByAsc("macro_code");
        List<FwdMacroDep> fwdMacroDepList = fwdMacroDepService.list(fwdMacroDepQueryWrapper);
        LinkedHashMap<String, String> relativityMap = new LinkedHashMap<>();
        fwdMacroDepList.stream().forEach(item -> {
            relativityMap.put(item.getMacroCode(), item.getCorrelation());
        });
        wilsonParamEntity.setRelativity(relativityMap);

        //macro data info -> MacrovariableList
        QueryWrapper<FwdMacroData> fwdMacroDataWrapper = new QueryWrapper<>();
        fwdMacroDataWrapper.between("data_date", fwdPlan.getStartDate(), fwdPlan.getEndDate())
                .orderByAsc("info_uuid");
        List<FwdMacroData> fwdMacroDataList = fwdMacroDataService.list(fwdMacroDataWrapper);
        List<String> infoUuidList = fwdMacroDataList.parallelStream().map(FwdMacroData::getInfoUuid).collect(Collectors.toList());

        QueryWrapper<FwdMacroInfo> fwdMacroInfoWrapper = new QueryWrapper<>();
        fwdMacroInfoWrapper.in("info_uuid", infoUuidList);
        List<FwdMacroInfo> fwdMacroInfoList = fwdMacroInfoService.list(fwdMacroInfoWrapper);
        Map<String, String> infoMap = new HashMap<>();
        fwdMacroInfoList.forEach(item -> {
            infoMap.put(item.getInfoUuid(), item.getMacroCode());
        });

        //处理data
        Map<String, List<FwdMacroData>> fwdMacroDataMap = new LinkedHashMap<>();

        for (FwdMacroData fwdMacroData : fwdMacroDataList) {
            if(fwdMacroDataMap.containsKey(fwdMacroData.getInfoUuid())){
                LinkedList<FwdMacroData> linkedList = new LinkedList<FwdMacroData>();
                linkedList.addAll(fwdMacroDataMap.get(fwdMacroData.getInfoUuid()));
                linkedList.add(fwdMacroData);
                fwdMacroDataMap.put(fwdMacroData.getInfoUuid(),linkedList);

                continue;
            }
            fwdMacroDataMap.put(fwdMacroData.getInfoUuid(),Arrays.asList(fwdMacroData));
        }

        Map<String, List<Macrovariable>> macrovariableMap = new LinkedHashMap<>();
        fwdMacroDataMap.forEach((key, value) -> {
            List<Macrovariable> macrovariableList = new ArrayList<>();
            value.forEach(item -> {
                Macrovariable macrovariable = new Macrovariable();
                macrovariable.setDataDate(item.getDataDate().format(df));
                macrovariable.setMacroValue(String.valueOf(item.getPdValue()));
                macrovariableList.add(macrovariable);
            });
            macrovariableMap.put(infoMap.getOrDefault(key,key), macrovariableList);
        });

        wilsonParamEntity.setMacrovariableList(Arrays.asList(macrovariableMap));

        return wilsonParamEntity;
    }
}
