package com.example.leetcode;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortArrayTest {
    @Test
    void should_sort_by_bubble() {
        SortArray<Integer> sortArray = new SortArray<>();

        Integer[] input = {2,3,4,5,6,1};

        Integer[] output = Arrays.copyOf(input, input.length);
        Arrays.sort(output);

        Integer[] result = sortArray.bubbleSort(input, false);

        Assert.assertArrayEquals(output, result);
    }

    @Test
    void should_sort_by_bubble_reverse() {
        SortArray<Integer> sortArray = new SortArray<>();

        Integer[] input = {2,3,4,5,6,1};

        Integer[] output = Arrays.copyOf(input, input.length);
        Arrays.sort(output, (o1, o2) -> o2.compareTo(o1));

        Integer[] result = sortArray.bubbleSort(input, true);

        Assert.assertArrayEquals(output, result);
    }

    @Test
    void should_sort_by_merge() {
        SortArray<Integer> sortArray = new SortArray<>();

        Integer[] input = {2,3,4,5,6,1};

        Integer[] output = Arrays.copyOf(input, input.length);
        Arrays.sort(output);

        Integer[] result = sortArray.mergeSort(input);

        Assert.assertArrayEquals(output, result);
    }
}