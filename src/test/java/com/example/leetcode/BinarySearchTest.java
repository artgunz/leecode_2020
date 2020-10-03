package com.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void should_find_element_position() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int toFind = 3;
        int expectedResult = 2;

        int result = new BinarySearch().search(input, toFind);

        Assert.assertEquals(expectedResult, result);
    }

    @Test(expected = RuntimeException.class)
    public void should_not_find_element_position_in_shuffled() {
        int[] input = {33, 434, 45, 667, 890, 324, 66, 3, 56, 89};
        int toFind = 3;
        new BinarySearch().search(input, toFind);
    }
}