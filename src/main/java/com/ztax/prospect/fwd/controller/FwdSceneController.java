package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdScene;
import com.ztax.prospect.fwd.mapper.FwdSceneMapper;
import com.ztax.prospect.fwd.service.FwdSceneService;
import com.ztax.prospect.fwd.service.impl.FwdSceneServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdScene")
public class FwdSceneController{
    @Autowired
    private FwdSceneServiceImpl FwdSceneService;
}