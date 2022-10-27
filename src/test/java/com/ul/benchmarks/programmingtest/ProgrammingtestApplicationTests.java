package com.ul.benchmarks.programmingtest;

import com.ul.benchmarks.programmingtest.model.ResultDb;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ProgrammingtestApplicationTests {

    @Autowired
    private ResultDb resultDb;

    @Test
    void testAddNewFireStrikeResult() {
        // TODO: add a new Fire Strike result with score 59500, user 'Mr Onion' and gpu count 4.
    }

    @Test
    void testAddInvalidFireStrikeResult() {
        // TODO: add a new invalid Fire Strike result.
    }
}
