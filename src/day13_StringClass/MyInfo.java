package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age");
        int age=input.nextInt();

        System.out.println("Enter your gender");
        String gender=input.next();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        System.out.println("enter your phone number");
        long phoneNumber=input.nextLong();

        System.out.println("enter your zip code");
        int zipCode= input.nextInt();

        input.nextLine();

        System.out.println("enter your school name");
        String schoolName=input.nextLine();

        input.close();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("schoolName = " + schoolName);




    }


}
