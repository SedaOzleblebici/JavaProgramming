package day12_Scanner;

import java.util.Scanner;

public class NextLinePractise {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println( "enter your age");
        int age=input.nextInt();

        input.nextLine(); // burası çok önemli

        System.out.println("enter full name");
        String fullName=input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);


        input.close();
        
        
        
        
    }


}
