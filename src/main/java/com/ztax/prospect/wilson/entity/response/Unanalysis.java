package com.ztax.prospect.wilson.entity.response;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Unanalysis {
    private Map<String,VarParams> allVarParams;
    private List<String> savedVarName;
}
