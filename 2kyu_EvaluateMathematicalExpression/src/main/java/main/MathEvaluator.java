package main;

import java.util.Arrays;

public class MathEvaluator {

    public double calculate(String expression) {

        char [] expressionClear = eliminateBlack(expression);

        for(int i = 0; i<expressionClear.length; i++){
            if(isNumber(expressionClear[i])){

            }
        }


        return 1;
    }

    public static char [] eliminateBlack(String str){
        char [] expressionChar = str.toCharArray();

        int contBlank = 0;

        //e
        for(int i = 0; i<expressionChar.length;i++){
            if((isBlank(expressionChar[i]))){
                contBlank++;
            }
        }
        char [] expression = new char[expressionChar.length-contBlank];
        int contAux = 0;
        System.out.println(contBlank);

        for(int i = 0; i<expressionChar.length;i++){
            if(!(isBlank(expressionChar[i]))){
                expression[contAux] = expressionChar[i];
                contAux++;
            }

        }

        return expression;
    }

    public boolean isNumber(char c){
        return (c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0');
    }
    public boolean isOperator(char c){
        return (c=='+' || c=='-' || c=='*' || c=='/');
    }
    public static boolean isBlank(char c){
        return c==' ';
    }
    public static void main(String args []){
        System.out.println(Arrays.toString(eliminateBlack("1 - 1")));
    }
}