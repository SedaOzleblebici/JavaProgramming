package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        String[] students={"elif","sinem","günay","cihad","james","daniel"};
        String[] earlyBirds= Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("-----------------------------------------------");

        char[] ch1={'A','B','C','D','E','F','G','H','I'};
        char[] ch2=Arrays.copyOfRange(ch1,2,6);//index no ya göre,6 dahil değil

        System.out.println(Arrays.toString(ch2));



    }


}
