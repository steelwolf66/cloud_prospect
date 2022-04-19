package com.ztax.prospect.macrovariable.controller;

import com.ztax.prospect.macrovariable.service.MacrovariableInfoService;
import com.ztax.prospect.macrovariable.service.impl.MacrovariableInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/MacrovariableInfo")
public class MacrovariableInfoController {
    @Autowired
    private MacrovariableInfoServiceImpl MacrovariableInfoService;
}