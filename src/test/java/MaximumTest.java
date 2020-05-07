package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaxIntegerAt1stPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(9,7,4,5,3);
        int max = maximum.findMax();
        Assert.assertEquals(9,max);
    }

    @Test
    public void givenMaxIntegerAt2ndPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(3,8,4,2,1);
        int max = maximum.findMax();
        Assert.assertEquals(8,max);
    }

    @Test
    public void givenMaxIntegerAt3rdPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(4, 5, 7);
        int max = maximum.findMax();
        Assert.assertEquals(7, max);
    }

}
