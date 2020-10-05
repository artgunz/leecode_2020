package com.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AnagramStringCheckTest {
    @Test
    public void should_check_anagram() {
        String first = "mama";
        String second = "maam";

        Assert.assertTrue(new AnagramStringCheck().check(first, second));
    }

    @Test
    public void should_check_polindrome() {
        String first = "maman";
        String second = "namam";

        Assert.assertTrue(new AnagramStringCheck().polindrome(first, second));
    }
}