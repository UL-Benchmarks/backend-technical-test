package com.ul.benchmarks.programmingtest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Collection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData implements Serializable {

    private Collection<HallOfFameResult> results;

    public ResultData() {

    }

    public Collection<HallOfFameResult> getResults() {
        return results;
    }

}
