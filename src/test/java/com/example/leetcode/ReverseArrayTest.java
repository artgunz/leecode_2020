package com.example.leetcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

class ReverseArrayTest {

    @Test
    void should_reverse_int() {
        Integer[] input = IntStream.range(0, 10).boxed().toArray(Integer[]::new);
        Integer[] output = IntStream.range(0, 10).map(i -> 10 - i-1).boxed().toArray(Integer[]::new);

        System.out.println("Will reverse input "+ Arrays.toString(input) + " to output " + Arrays.toString(output));

        ReverseArray<Integer> integerReverseArray = new ReverseArray<>();

        Integer[] result = integerReverseArray.reverse(input);
        System.out.println("Result of test is array "+ Arrays.toString(result));

        Assert.assertArrayEquals(output, result);
    }

    @Test
    void should_reverse_long() {
        Long[] input = LongStream.range(0, 10).boxed().toArray(Long[]::new);
        Long[] output = LongStream.range(0, 10).map(i -> 10 - i-1).boxed().toArray(Long[]::new);

        System.out.println("Will reverse input "+ Arrays.toString(input) + " to output " + Arrays.toString(output));

        ReverseArray<Long> integerReverseArray = new ReverseArray<>();

        Long[] result = integerReverseArray.reverse(input);
        System.out.println("Result of test is array "+ Arrays.toString(result));

        Assert.assertArrayEquals(output, result);
    }
}