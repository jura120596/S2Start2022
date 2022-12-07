package com.example.s2start2022;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void mult_isCorrect() {
        assertEquals(7, MainActivity.mult(2,3));
        assertEquals(4, MainActivity.mult(2,2));
        assertEquals(60000, MainActivity.mult(200,300));
    }
    @Test
    public void sumArr_isCorrect() {
        int[] a = {2,3,4,5,7};
        assertEquals(21, MainActivity.sumArr(a));
    }
}