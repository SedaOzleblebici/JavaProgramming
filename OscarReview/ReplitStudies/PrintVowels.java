package ReplitStudies;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
/*Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho
​
Output: oo
Input: howdyho

Output: oo

Input: huehuehuehue
​
Output: ueueueue

 */
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String vowels="";


        for (int i = 0; i <= word.length()-1; i++) {
            String temp=""+word.charAt(i);

            if((temp.equalsIgnoreCase("a")) ||
                    (temp.equalsIgnoreCase("e") ) ||
                    (temp.equalsIgnoreCase("i")) ||
                    (temp.equalsIgnoreCase("o")) ||
                    (temp.equalsIgnoreCase("u")) ){
                vowels += temp;
            }
        }
        System.out.println(vowels);



    }


}
