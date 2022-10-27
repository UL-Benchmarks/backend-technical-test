package com.ul.benchmarks.programmingtest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HallOfFameResult {
    private String user;
    private int overallScore;
    private int rank;
    private int gpuCount;

    public HallOfFameResult() {
        this.user = null;
        this.overallScore = 0;
        this.gpuCount = 1;
        this.rank = -1;
    }

    public HallOfFameResult(String user, int score, int gpuCount) {
        this.user = user;
        this.overallScore = score;
        this.gpuCount = gpuCount;
        this.rank = -1;
    }

    public String getUser() {
        return user;
    }

    public int getOverallScore() {
        return overallScore;
    }

    public int getGpuCount() {
        return gpuCount;
    }

    public int getRank() {
        return rank;
    }

    protected void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object other) {
        // in this simplified implementation (user name + score) is a unique key
        if (other instanceof HallOfFameResult) {
            return overallScore == ((HallOfFameResult)other).overallScore && user.equals(((HallOfFameResult)other).user);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 31 * overallScore + user.hashCode();
    }
}
