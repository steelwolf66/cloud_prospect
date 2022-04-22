package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdWilsonParamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdWilsonParam")
public class FwdWilsonParamController{
    @Autowired
    private FwdWilsonParamServiceImpl FwdWilsonParamService;
}