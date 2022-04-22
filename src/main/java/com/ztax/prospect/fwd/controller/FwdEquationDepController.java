package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdEquationDepServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdEquationDep")
public class FwdEquationDepController{
    @Autowired
    private FwdEquationDepServiceImpl FwdEquationDepService;
}