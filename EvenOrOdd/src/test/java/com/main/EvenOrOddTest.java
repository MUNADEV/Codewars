package com.main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
    @Test
    public void EvenOrOddTest(){
        String even = "Even";
        String odd = "Odd";

        int numberEven = 30;
        int numberOdd = 51;


        assertEquals(even,EvenOrOdd.even_or_odd(numberEven));
        assertEquals(odd,EvenOrOdd.even_or_odd(numberOdd));
    }

}