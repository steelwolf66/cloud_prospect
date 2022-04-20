package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdPlan;
import com.ztax.prospect.fwd.mapper.FwdPlanMapper;
import com.ztax.prospect.fwd.service.FwdPlanService;
import com.ztax.prospect.fwd.service.impl.FwdPlanServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdPlan")
public class FwdPlanController{
    @Autowired
    private FwdPlanServiceImpl FwdPlanService;
}