package main;

import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {
        // igPay atinlay siay oolcay -- Pig latin is cool
        String [] strArray = strToArray(str);
        String strFinal = "";
        char [] arraytoChar;

        //Ciclo, itera las palabras
        for(int i = 0; i < strArray.length; i++) {
            arraytoChar = strArray[i].toCharArray();
            //almacena el primer caracter de la palabra
            char first = arraytoChar[0];
            //mover primer [] a ultimo []
            if (onlyLetters(strArray[i])) {

                //Ciclo, itera los caracteres de la palabra
                for (int j = 0; j < arraytoChar.length; j++) {
                    //Condicional si se encuntra en el ultimo [] de la palabra
                    if (!(j == arraytoChar.length - 1)) {
                        arraytoChar[j] = arraytoChar[j + 1];
                        //de lo contrario se pasará el char de la posicion siguiente a la anterior
                    } else {
                        arraytoChar[arraytoChar.length - 1] = first;
                    }
                }
                //Agrega la palabra char y la palabra "ay"
                strFinal += new String(arraytoChar);
                strFinal += "ay";
                //Evalua agregar un espacio al String de retorno
                if (!(i == strArray.length - 1)) {
                    strFinal += " ";
                }
            }else{
                strFinal+=strArray[i];
                //Evalua agregar un espacio al String de retorno
                if (!(i == strArray.length - 1)) {
                    strFinal += " ";
                }
            }



        }
        return strFinal;
    }

    /**
     * Trasnforma un string en un arreglo tipo string
     * @param str Frase
     * @return Arreglo tipo String
     */
    public static String[] strToArray(String str){
        String separetor = " ";
        Pattern ptr = Pattern.compile(separetor);

        return ptr.split(str);

    }

    /**
     * Comprueba si una palabra contiene solamente letras
     * @param str palabra tipo String
     * @return true si la palabra solamente contiene letras
     */
    public static boolean onlyLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (!((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))) {
                return false;
            }
        }
        return true;
    }
}