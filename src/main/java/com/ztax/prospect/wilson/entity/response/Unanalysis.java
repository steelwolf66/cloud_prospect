package com.ztax.prospect.wilson.entity.response;

import java.util.List;
import java.util.Map;

public class Unanalysis {
    private Map<String,VarParams> all_var_params;
    private List<Object> saved_var_name;

    public Map<String, VarParams> getAll_var_params() {
        return all_var_params;
    }

    public void setAll_var_params(Map<String, VarParams> all_var_params) {
        this.all_var_params = all_var_params;
    }

    public List<Object> getSaved_var_name() {
        return saved_var_name;
    }

    public void setSaved_var_name(List<Object> saved_var_name) {
        this.saved_var_name = saved_var_name;
    }
}
