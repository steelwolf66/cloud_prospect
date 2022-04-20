package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.entity.FwdEquationDep;
import com.ztax.prospect.fwd.mapper.FwdEquationDepMapper;
import com.ztax.prospect.fwd.service.FwdEquationDepService;
import com.ztax.prospect.fwd.service.impl.FwdEquationDepServiceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/FwdEquationDep")
public class FwdEquationDepController{
    @Autowired
    private FwdEquationDepServiceImpl FwdEquationDepService;
}