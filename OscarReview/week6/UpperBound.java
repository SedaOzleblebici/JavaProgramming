package week6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        /*
         *
         * Question-8:

         Write a program to calculate the sum of the numbers from 1 till upper bound.
         If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
         If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
         If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

         */
        System.out.println("Write a number for an upper bound");
        Scanner scan=new Scanner(System.in);
        int bound=scan.nextInt();
        int sum=0;

        for (int i=0 ; i <=bound ; i++) {
            sum +=i;

        }
        System.out.println("sum = " + sum);



    }


}
