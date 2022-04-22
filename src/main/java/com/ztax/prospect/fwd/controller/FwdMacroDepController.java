package com.ztax.prospect.fwd.controller;

import com.ztax.prospect.fwd.service.impl.FwdMacroDepServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;
;

@RestController
@RequestMapping("/FwdMacroDep")
public class FwdMacroDepController{
    @Autowired
    private FwdMacroDepServiceImpl FwdMacroDepService;
}