package com.example.javastructures;

import org.junit.Assert;
import org.junit.Test;

class IntegerCompareTest {
    @Test
    public void should_compare() {
        Assert.assertTrue(new IntegerCompare().compare(1,1));
    }

    @Test
    public void should_not_compare() {
        Assert.assertFalse(new IntegerCompare().compare(22222,22222));
    }
}