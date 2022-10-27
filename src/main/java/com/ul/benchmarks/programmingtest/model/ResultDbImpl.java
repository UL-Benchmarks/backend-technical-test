package com.ul.benchmarks.programmingtest.model;

import com.ul.benchmarks.programmingtest.util.JsonUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class ResultDbImpl implements ResultDb {

    private static Map<TestType, List<HallOfFameResult>> results = null;

    public ResultDbImpl() {
        if (results == null) {
            results = new TreeMap<>();
            List<HallOfFameResult> fireStrikeResults = (List<HallOfFameResult>)JsonUtil.deserializeOrThrow(getClass().getClassLoader().getResourceAsStream("firestrike.json"), ResultData.class).getResults();
            fireStrikeResults.sort((a, b) -> b.getOverallScore() - a.getOverallScore());
            results.put(TestType.FIRE_STRIKE, fireStrikeResults);
            List<HallOfFameResult> timeSpyResults = (List<HallOfFameResult>)JsonUtil.deserializeOrThrow(getClass().getClassLoader().getResourceAsStream("timespy.json"), ResultData.class).getResults();
            timeSpyResults.sort((a, b) -> b.getOverallScore() - a.getOverallScore());
            results.put(TestType.TIME_SPY, timeSpyResults);
        }
    }

    @Override
    public List<HallOfFameResult> getResults(TestType testType) {
        return results.get(testType);
    }

    @Override
    public List<HallOfFameResult> addResult(TestType testType, HallOfFameResult result) {
        // TODO: implement this
        return results.get(testType);
    }
}
