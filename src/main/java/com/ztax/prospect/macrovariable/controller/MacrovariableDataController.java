package com.ztax.prospect.macrovariable.controller;

import com.ztax.prospect.macrovariable.service.impl.MacrovariableDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/MacrovariableData")
public class MacrovariableDataController{
    @Autowired
    private MacrovariableDataServiceImpl MacrovariableDataService;
}