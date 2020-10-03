package com.example.leetcode;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PairCheckerTest {
    @Test
    void should_find_pair_for_sum() {
        Integer[] input = {1, -2, -4, 5};
        Integer sum = -6;
        Integer[] output = {-4, -2};

        PairChecker pairChecker = new PairChecker();
        Integer[] result = pairChecker.getPairForSum(input, sum);

        System.out.println("Result array pair " + Arrays.toString(result));

        Assert.assertArrayEquals(output, result);
    }

    @Test
    void should_find_not_pair_for_sum() {
        Integer[] input = {1, -2, -4, 5};
        Integer sum = 0;

        PairChecker pairChecker = new PairChecker();

        assertThrows(IllegalArgumentException.class, () -> pairChecker.getPairForSum(input, sum), "Not expected behavior");
    }
}