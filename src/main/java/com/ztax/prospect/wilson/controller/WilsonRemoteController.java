package com.ztax.prospect.wilson.controller;

import com.ztax.common.result.Result;
import com.ztax.prospect.wilson.service.impl.WilsonRemoteServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
@Slf4j
public class WilsonRemoteController {

    @Autowired
    private WilsonRemoteServiceImpl wilsonRemoteService;

    /**
     * 远程调用前瞻性计算服务
     * 异步调用及异步处理结果
     *
     * @param planUuid
     * @return
     */
    @GetMapping(value = "/wilson/remote/{planUuid}")
    public Result calculateByRemote(@PathVariable("planUuid") String planUuid) {
        CompletableFuture.supplyAsync(() -> {
            return wilsonRemoteService.asyncCallRemote(planUuid);
            //todo 异步处理结果
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