package week2;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {
        String name ="";
        System.out.println("Output");

        Scanner input = new Scanner(System.in);

        System.out.println("Put your name");

        name = input.next(); // reads the data from console

        System.out.println("name = " + name);

        String str = input.nextLine();

    }


}
