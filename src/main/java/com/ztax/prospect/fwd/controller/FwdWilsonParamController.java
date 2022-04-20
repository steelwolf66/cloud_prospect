package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdWilsonParam;
import com.ztax.prospect.fwd.mapper.FwdWilsonParamMapper;
import com.ztax.prospect.fwd.service.FwdWilsonParamService;
import com.ztax.prospect.fwd.service.impl.FwdWilsonParamServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdWilsonParam")
public class FwdWilsonParamController{
    @Autowired
    private FwdWilsonParamServiceImpl FwdWilsonParamService;
}