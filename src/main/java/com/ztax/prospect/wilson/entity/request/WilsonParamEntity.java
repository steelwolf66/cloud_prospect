package com.ztax.prospect.wilson.entity.request;

import java.util.List;
import java.util.Map;


public class WilsonParamEntity {
    private String uuid;
    private List<Pd> pdList;
    private List<Map<String, List<Macrovariable>>> macrovariableList;

    private String pValue;
    private String r2;
    private String equationPValue;
    private String equationR2;

    private String vifType;
    private String vifValue;
    private String modelType;

    private String slentry;
    private String slstay;

    private Map<String,String> relativity;

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

    public String getpValue() {
        return pValue;
    }

    public void setpValue(String pValue) {
        this.pValue = pValue;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getEquationPValue() {
        return equationPValue;
    }

    public void setEquationPValue(String equationPValue) {
        this.equationPValue = equationPValue;
    }

    public String getEquationR2() {
        return equationR2;
    }

    public void setEquationR2(String equationR2) {
        this.equationR2 = equationR2;
    }

    public String getVifType() {
        return vifType;
    }

    public void setVifType(String vifType) {
        this.vifType = vifType;
    }

    public String getVifValue() {
        return vifValue;
    }

    public void setVifValue(String vifValue) {
        this.vifValue = vifValue;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getSlentry() {
        return slentry;
    }

    public void setSlentry(String slentry) {
        this.slentry = slentry;
    }

    public String getSlstay() {
        return slstay;
    }

    public void setSlstay(String slstay) {
        this.slstay = slstay;
    }

    public Map<String,String> getRelativity() {
        return relativity;
    }

    public void setRelativity(Map<String,String> relativity) {
        this.relativity = relativity;
    }
}
