package com.ztax.prospect.wilson.entity.response;

import java.util.List;

public class ResponseFromWG {
    private String message;
    private String uuid;
    private List<Unanalysis> unanalysisList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<Unanalysis> getUnanalysisList() {
        return unanalysisList;
    }

    public void setUnanalysisList(List<Unanalysis> unanalysisList) {
        this.unanalysisList = unanalysisList;
    }
}
