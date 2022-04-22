package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdEquationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdEquation")
public class FwdEquationController{
    @Autowired
    private FwdEquationServiceImpl FwdEquationService;
}