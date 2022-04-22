package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String email="seda.ozleblebi@gmail.com";
        String[] arr=email.split("@");

        System.out.println(Arrays.toString(arr)); //output: [seda.ozleblebi, gmail.com]


    }


}
