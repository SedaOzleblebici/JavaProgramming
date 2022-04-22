package Replıt.Variables;

import java.util.Scanner;

public class PatientInfo {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();


//        Patient personal information
//        Full name: Tyson, Mike
//        Address: 7911 Westpark Dr, McLean, VA 22102
//        Contacts: work phone number - 7896542315, personal phone number - 2406542315, email: miketyson@gmail.com
//        Age: 45
//        Height: 6.1
//        Weight: 175.2 pounds
//        Married?: false
        String contacts = "Contacts: work phone number - " + workPhoneNumber + ", personal phone number - "
                + personalPhoneNumber + ", e-mail: " + email;
        String fullName = lastName + ", " + firstName;
        String address = street + ", " + city + ", " + state + " " + zipcode;
        System.out.println("Patient personal information\nFull name: " + fullName + "\nAddress: " + address + "\n" + contacts
                + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + " pounds \nMarried?: " + isMarried);


        scan.close();


        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city




    }
}
