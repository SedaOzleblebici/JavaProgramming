package day15_ForLoop;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
/*1. Write a program that can return the sum of even numbers between 1
to 100

 */
       int sum=0;
        for (int i = 2; i <=100 ; i+=2) {
            sum += i;
        }
        System.out.println(sum);


    }

}
