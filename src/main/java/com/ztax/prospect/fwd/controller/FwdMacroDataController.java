package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdMacroDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdMacroData")
public class FwdMacroDataController{
    @Autowired
    private FwdMacroDataServiceImpl FwdMacroDataService;
}