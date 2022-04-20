package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdDefRate;
import com.ztax.prospect.fwd.mapper.FwdDefRateMapper;
import com.ztax.prospect.fwd.service.FwdDefRateService;
import com.ztax.prospect.fwd.service.impl.FwdDefRateServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdDefRate")
public class FwdDefRateController{
    @Autowired
    private FwdDefRateServiceImpl FwdDefRateService;
}