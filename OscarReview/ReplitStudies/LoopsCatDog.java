package ReplitStudies;

import java.util.Locale;
import java.util.Scanner;

public class LoopsCatDog {
    public static void main(String[] args) {
        /*
        Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true
input: catdog
output: true

Example:

input: catcat
output: false
input: catcat
output: false

Example:

input: cat-cheetah-dog-cat
output: false
         */
        Scanner scan=new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next().toLowerCase();

        word=word.replace("cat","0").replace("dog","1");
        for (int i=0; i<word.length(); i++){
            char ch=word.charAt(i);
            if (ch=='0'){
                countOfCats++;
            }
            else if
            (ch=='1'){
                countOfDogs++;
            }
        }
        boolean result=countOfCats==countOfDogs;
        System.out.println(result);
    }
}








