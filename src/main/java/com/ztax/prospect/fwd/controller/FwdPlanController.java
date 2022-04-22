package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdPlan")
public class FwdPlanController{
    @Autowired
    private FwdPlanServiceImpl FwdPlanService;
}