package com.ul.benchmarks.programmingtest.model;

import java.util.List;

public interface ResultDb {

    /**
     *  Returns the best 3DMark results for a given test type
     */
    public List<HallOfFameResult> getResults(TestType testType);

    /**
     * Adds a new result to hof list and returns the updated list
     */
    public List<HallOfFameResult> addResult(TestType testType, HallOfFameResult result);
}
