package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdSceneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdScene")
public class FwdSceneController{
    @Autowired
    private FwdSceneServiceImpl FwdSceneService;
}