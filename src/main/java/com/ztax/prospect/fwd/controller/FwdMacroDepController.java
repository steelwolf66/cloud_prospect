package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdMacroDep;
import com.ztax.prospect.fwd.mapper.FwdMacroDepMapper;
import com.ztax.prospect.fwd.service.FwdMacroDepService;
import com.ztax.prospect.fwd.service.impl.FwdMacroDepServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdMacroDep")
public class FwdMacroDepController{
    @Autowired
    private FwdMacroDepServiceImpl FwdMacroDepService;
}