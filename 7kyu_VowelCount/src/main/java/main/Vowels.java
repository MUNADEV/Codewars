package main;
public class Vowels {
    public static int getCount(String str) {
        char strArray[] = str.toCharArray();
        int count = 0;
        for (char c : strArray){
            switch (c){
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}
