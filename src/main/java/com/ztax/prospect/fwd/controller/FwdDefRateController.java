package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdDefRateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdDefRate")
public class FwdDefRateController{
    @Autowired
    private FwdDefRateServiceImpl FwdDefRateService;
}