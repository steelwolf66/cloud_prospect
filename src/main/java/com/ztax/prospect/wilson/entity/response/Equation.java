package com.ztax.prospect.wilson.entity.response;

import lombok.Data;

import java.util.Map;


public class Equation {
    private Map<String,String> coefs;
    private String equation;
    private String fPvalue;
    private String fValue;
    private String rsquaredAdj;

    public Map<String, String> getCoefs() {
        return coefs;
    }

    public void setCoefs(Map<String, String> coefs) {
        this.coefs = coefs;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public String getfPvalue() {
        return fPvalue;
    }

    public void setfPvalue(String fPvalue) {
        this.fPvalue = fPvalue;
    }

    public String getfValue() {
        return fValue;
    }

    public void setfValue(String fValue) {
        this.fValue = fValue;
    }

    public String getRsquaredAdj() {
        return rsquaredAdj;
    }

    public void setRsquaredAdj(String rsquaredAdj) {
        this.rsquaredAdj = rsquaredAdj;
    }
}
