package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdMacroData;
import com.ztax.prospect.fwd.mapper.FwdMacroDataMapper;
import com.ztax.prospect.fwd.service.FwdMacroDataService;
import com.ztax.prospect.fwd.service.impl.FwdMacroDataServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdMacroData")
public class FwdMacroDataController{
    @Autowired
    private FwdMacroDataServiceImpl FwdMacroDataService;
}