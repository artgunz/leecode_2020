package com.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

class ReverseStringTest {
    @Test
    public void should_reverse() {
        String input = "ABCD";
        String expected = "DCBA";

        ReverseString reverseString = new ReverseString();

        String result = reverseString.reverse(input);

        System.out.println(result);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void should_reverse_non_sb() {
        String input = "ABCD";
        String expected = "DCBA";

        ReverseString reverseString = new ReverseString();

        String result = reverseString.reverseNonSB(input);

        System.out.println(result);

        Assert.assertEquals(expected, result);
    }

    @Test
    void should_reverse_stack() {
        String input = "ABCD";
        String expected = "DCBA";

        ReverseString reverseString = new ReverseString();

        String result = reverseString.reverseWithStack(input);

        System.out.println(result);

        Assert.assertEquals(expected, result);
    }
}