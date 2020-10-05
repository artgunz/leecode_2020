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
        Integer sum = 6;
        Integer[] output = {1, 5};

        PairChecker pairChecker = new PairChecker();
        Integer[] result = pairChecker.getPairForSum(input, sum);

        System.out.println("Result array pair " + Arrays.toString(result));

        Arrays.sort(output);
        Arrays.sort(result);
        Assert.assertArrayEquals(output, result);
    }

    @Test
    void should_find_pair_for_sum_simple() {
        Integer[] input = {1, -2, -4, 5};
        Integer sum = 6;
        Integer[] output = {1, 5};

        PairChecker pairChecker = new PairChecker();
        Integer[] result = pairChecker.getPairForSumSimple(input, sum);

        System.out.println("Result array pair " + Arrays.toString(result));

        Arrays.sort(output);
        Arrays.sort(result);
        Assert.assertArrayEquals(output, result);
    }

    @Test
    void should_find_triple_for_sum() {
        Integer[] input = {1, -2, -4, 5, 7, 10};
        Integer sum = 9;
        Integer[] output = {1, -2, 10};

        PairChecker pairChecker = new PairChecker();
        Integer[] result = pairChecker.getTripleForSum(input, sum);

        System.out.println("Result array pair " + Arrays.toString(result));

        Arrays.sort(output);
        Arrays.sort(result);
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