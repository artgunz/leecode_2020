package com.example.leetcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AnagramStringCheckTest {
    @Test
    void should_check_anagram() {
        String first = "mama";
        String second = "maam";

        Assert.assertTrue(new AnagramStringCheck().check(first, second));
    }

    @Test
    void should_check_polindrome() {
        String first = "maman";
        String second = "namam";

        Assert.assertTrue(new AnagramStringCheck().polindrome(first, second));
    }
}