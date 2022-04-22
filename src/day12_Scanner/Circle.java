package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double r=scan.nextDouble();
        scan.close();

        double area=r *r * 3.14;
        double perimeter= 2* 3.14* r;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);






    }


}
