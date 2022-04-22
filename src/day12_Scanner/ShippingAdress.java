package day12_Scanner;


import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter your full name");
        String fullName=input.nextLine();

        System.out.println("enter your building number");
        String buildingNumber=input.next();

        input.nextLine();

        System.out.println("enter your street name");
        String streetName=input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);

        input.close();







    }


}
