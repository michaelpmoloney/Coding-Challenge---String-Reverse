/*This program is a coding practice.
The challenge is to reverse the words in a string,
but not to reverse the letters.
 */
package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //create test string then split up the words into
        //and array of strings using the split function
        String str = "test this string right now";
        String[] arrOfStr = str.split(" ",-2);
        //reverse the words in the string array 
        //using a for loop
        for (int i = 0; i < arrOfStr.length/2; i++){
            String temp = arrOfStr[i];
            arrOfStr[i] = arrOfStr[arrOfStr.length-i-1];
            arrOfStr[arrOfStr.length-i-1] = temp;
        }
        //print the words from the string array
        for (int i = 0; i < arrOfStr.length; i++){
            System.out.print(arrOfStr[i]);
            System.out.print(" ");
        }

    }
}