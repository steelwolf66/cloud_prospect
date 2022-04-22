package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdMacroInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdMacroInfo")
public class FwdMacroInfoController{
    @Autowired
    private FwdMacroInfoServiceImpl FwdMacroInfoService;
}