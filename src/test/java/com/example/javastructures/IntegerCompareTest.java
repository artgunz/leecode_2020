package com.example.javastructures;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerCompareTest {
    @Test
    void should_compare() {
        Assert.assertTrue(new IntegerCompare().compare(1,1));
    }

    @Test
    void should_not_compare() {
        Assert.assertFalse(new IntegerCompare().compare(22222,22222));
    }
}