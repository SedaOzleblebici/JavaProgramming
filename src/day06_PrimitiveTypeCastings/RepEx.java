package day06_PrimitiveTypeCastings;

import javax.management.QueryExp;
import java.util.Scanner;

import static javax.management.Query.in;

public class RepEx {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your e-mail");
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
        boolean isMarried = true;


        String contacts = "Contacts: work phone number - " + workPhoneNumber + ", personal phone number - "
                + personalPhoneNumber + ", email: " + email;
        String fullName = lastName + ", " + firstName;
        String address = street + ", " + city + ", " + state + " " + zipcode;
        System.out.println("Patient personal information\nFull name: " + fullName + "\nAddress: " + address + "\n" + contacts
                + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + " pounds \nMarried?: " + isMarried);

    }

}
