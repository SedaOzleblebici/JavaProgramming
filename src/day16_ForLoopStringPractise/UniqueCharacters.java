package day16_ForLoopStringPractise;

public class UniqueCharacters {
    public static void main(String[] args) {
// input: AABCCD  output:BD write a program that can return the unique characters from a String

        String str="aaabccc";
        String result="";

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str,starting from 0
            char ch= str.charAt(i);
            if(str.indexOf(ch)== str.lastIndexOf(ch)){ // if the first and last index numbers of the character are same,then the character is unique.
                result+= ch;
        }

        //char ch='b';


        }
        System.out.println(result);


    }


}
