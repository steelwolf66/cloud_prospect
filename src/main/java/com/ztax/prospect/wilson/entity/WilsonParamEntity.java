package com.ztax.prospect.wilson.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public class WilsonParamEntity {
    private String uuid;
    private List<Pd> pdList;
    private List<Map<String, List<Macrovariable>>> macrovariableList;

    private BigDecimal pValue;
    private BigDecimal r2;
    private BigDecimal equationPValue;
    private BigDecimal equationR2;

    private Integer vifType;
    private BigDecimal vifValue;
    private Integer modelType;

    private BigDecimal slentry;
    private BigDecimal slstay;

    private Relativity relativity;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<Pd> getPdList() {
        return pdList;
    }

    public void setPdList(List<Pd> pdList) {
        this.pdList = pdList;
    }

    public List<Map<String, List<Macrovariable>>> getMacrovariableList() {
        return macrovariableList;
    }

    public void setMacrovariableList(List<Map<String, List<Macrovariable>>> macrovariableList) {
        this.macrovariableList = macrovariableList;
    }

    public BigDecimal getpValue() {
        return pValue;
    }

    public void setpValue(BigDecimal pValue) {
        this.pValue = pValue;
    }

    public BigDecimal getR2() {
        return r2;
    }

    public void setR2(BigDecimal r2) {
        this.r2 = r2;
    }

    public BigDecimal getEquationPValue() {
        return equationPValue;
    }

    public void setEquationPValue(BigDecimal equationPValue) {
        this.equationPValue = equationPValue;
    }

    public BigDecimal getEquationR2() {
        return equationR2;
    }

    public void setEquationR2(BigDecimal equationR2) {
        this.equationR2 = equationR2;
    }

    public Integer getVifType() {
        return vifType;
    }

    public void setVifType(Integer vifType) {
        this.vifType = vifType;
    }

    public BigDecimal getVifValue() {
        return vifValue;
    }

    public void setVifValue(BigDecimal vifValue) {
        this.vifValue = vifValue;
    }

    public Integer getModelType() {
        return modelType;
    }

    public void setModelType(Integer modelType) {
        this.modelType = modelType;
    }

    public BigDecimal getSlentry() {
        return slentry;
    }

    public void setSlentry(BigDecimal slentry) {
        this.slentry = slentry;
    }

    public BigDecimal getSlstay() {
        return slstay;
    }

    public void setSlstay(BigDecimal slstay) {
        this.slstay = slstay;
    }

    public Relativity getRelativity() {
        return relativity;
    }

    public void setRelativity(Relativity relativity) {
        this.relativity = relativity;
    }
}
