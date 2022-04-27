package com.ztax.prospect.wilson.entity.response;

import lombok.Data;

import java.util.List;
@Data
public class ResponseFromWG {
    private String uuid;
    private List<Equation> equationList;
    private List<Unanalysis> unanalysisList;
    private List<Vif> vif;

}
