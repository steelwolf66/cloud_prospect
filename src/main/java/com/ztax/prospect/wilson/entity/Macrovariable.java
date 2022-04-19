package com.ztax.prospect.wilson.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Macrovariable {
    private String dataDate;

    @JsonProperty(value = "Value")
    private String macroValue;

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate;
    }

    public String getMacroValue() {
        return macroValue;
    }

    public void setMacroValue(String macroValue) {
        this.macroValue = macroValue;
    }
}
