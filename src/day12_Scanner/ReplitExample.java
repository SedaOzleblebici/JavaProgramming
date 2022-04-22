package day12_Scanner;
import java.util.*;
public class ReplitExample {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if(number>=0 && number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }



    }


}
