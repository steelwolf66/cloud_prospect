package com.ztax.prospect.wilson.entity.response;

import lombok.Data;

import java.math.BigDecimal;

public class VarParams {
    private BigDecimal coef;
    private String pValue;
    private String rsquared;

    public BigDecimal getCoef() {
        return coef;
    }

    public void setCoef(BigDecimal coef) {
        this.coef = coef;
    }

    public String getpValue() {
        return pValue;
    }

    public void setpValue(String pValue) {
        this.pValue = pValue;
    }

    public String getRsquared() {
        return rsquared;
    }

    public void setRsquared(String rsquared) {
        this.rsquared = rsquared;
    }
}
