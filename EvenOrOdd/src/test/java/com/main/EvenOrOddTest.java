package com.main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
    @Test
    public void EvenOrOddTest(){
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.even_or_odd(6));
        assertEquals("Odd", eoo.even_or_odd(7));
        assertEquals("Even", eoo.even_or_odd(0));
        assertEquals("Odd", eoo.even_or_odd(-1));
    }

}