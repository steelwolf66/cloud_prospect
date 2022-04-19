package com.ztax.prospect.wilson.entity.response;

import java.math.BigDecimal;

public class VarParams {
    private BigDecimal coef;
    private String p_value;
    private BigDecimal rsquared;

    public BigDecimal getCoef() {
        return coef;
    }

    public void setCoef(BigDecimal coef) {
        this.coef = coef;
    }

    public String getP_value() {
        return p_value;
    }

    public void setP_value(String p_value) {
        this.p_value = p_value;
    }

    public BigDecimal getRsquared() {
        return rsquared;
    }

    public void setRsquared(BigDecimal rsquared) {
        this.rsquared = rsquared;
    }
}
