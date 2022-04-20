package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdMacroInfo;
import com.ztax.prospect.fwd.mapper.FwdMacroInfoMapper;
import com.ztax.prospect.fwd.service.FwdMacroInfoService;
import com.ztax.prospect.fwd.service.impl.FwdMacroInfoServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdMacroInfo")
public class FwdMacroInfoController{
    @Autowired
    private FwdMacroInfoServiceImpl FwdMacroInfoService;
}