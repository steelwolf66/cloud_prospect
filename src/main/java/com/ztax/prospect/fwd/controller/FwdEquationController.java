package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdEquation;
import com.ztax.prospect.fwd.mapper.FwdEquationMapper;
import com.ztax.prospect.fwd.service.FwdEquationService;
import com.ztax.prospect.fwd.service.impl.FwdEquationServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdEquation")
public class FwdEquationController{
    @Autowired
    private FwdEquationServiceImpl FwdEquationService;
}