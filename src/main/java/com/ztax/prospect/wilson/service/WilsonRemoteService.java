package com.ztax.prospect.wilson.service;

import com.ztax.prospect.wilson.entity.request.WilsonParamEntity;
import com.ztax.prospect.wilson.entity.response.ResponseFromWG;

public interface WilsonRemoteService {
    //测试方法，在内存中构建参数实体
    WilsonParamEntity loadWilsonParamEntity();

    WilsonParamEntity loadParamEntityFromDB(String planUuid);

    ResponseFromWG asyncCallRemote(String planUuid);
}
