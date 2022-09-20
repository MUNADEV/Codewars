package main;

public class Solution {
    public int solution(int number) {
        //TODO: Code stuff here
        int count = 0;

        if (number<0){
            return 0;
        }
        for (int i = 0; i<number;i++){
            //suma el número si corresponde a multiplo de 3 o 5
            if(i%3 == 0 || i%5 == 0) {
                count += i;
                //suma 1 si el número corresponde a multiplos de 3 y 5
            }else if(i%3 == 0 && i%5 == 0){
                count++ ;
            }
        }
        return count;
    }
}