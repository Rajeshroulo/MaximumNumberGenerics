package com.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaxIntegerAt1stPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(9,7,4,5,6,3);
        int max = maximum.findMax();
        Assert.assertEquals(9,max);
    }

    @Test
    public void givenMaxIntegerAt2ndPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(3,8,4,2,5,1);
        int max = maximum.findMax();
        Assert.assertEquals(8,max);
    }

    @Test
    public void givenMaxIntegerAt3rdPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(4, 5, 7);
        int max = maximum.findMax();
        Assert.assertEquals(7, max);
    }

    @Test
    public void givenMaxFloatAt1stPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximum = new Maximum<>(2.4f,1.5f,2.1f);
        Float max = maximum.findMax();
        Assert.assertEquals(2.4, max, 0.001);
    }

    @Test
    public void givenMaxFloatAt2ndPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximumNumber = new Maximum<>(1.3f,3.5f,2.7f);
        Float max = maximumNumber.findMax();
        Assert.assertEquals(3.5, max, 0.001);
    }
    @Test
    public void givenMaxFloatAt3rdPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximum = new Maximum<>(1.2f,2.3f,4.4f);
        Float max = maximum.findMax();
        Assert.assertEquals(4.4, max, 0.001);
    }

    @Test
    public void givenMaxStringAt1stPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("banana","Banana","Peach");
        String max = maximum.findMax();
        Assert.assertEquals("banana", max);
    }

    @Test
    public void givenMaxStringAt2ndPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("Banana","apple","Peach");
        String max = maximum.findMax();
        Assert.assertEquals("apple", max);
    }

    @Test
    public void givenMaxStringAtlastPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("Banana","Apple","Peach");
        String max = maximum.findMax();
        Assert.assertEquals("Peach", max);
    }

}
