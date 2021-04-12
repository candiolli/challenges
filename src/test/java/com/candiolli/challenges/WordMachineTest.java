package com.candiolli.challenges;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordMachineTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solution() {
        Assert.assertEquals(8, WordMachine.solution("4 5 6 - 7 +"));
        Assert.assertEquals(7, WordMachine.solution("13 DUP 4 POP 5 DUP + DUP + -"));
        Assert.assertEquals(-1, WordMachine.solution("5 6 + -"));
    }
}