package com.main;

public class EvenOrOdd {

    public static String even_or_odd(int number) {
        //Resto 0 == Par
        boolean isEven = number%2 == 0;

        if(isEven){
            return "Even";
        }else{
            return "Odd";
        }
    }


}