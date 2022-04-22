package day09_IfStatements.task;

import java.util.Scanner;

public class SalaryAfterTax {

    //2- Write a program that can calculate the salary after tax based on the following requirements

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Salary: ");
        double salary= scanner.nextDouble();
        System.out.println("Are your married? true or false");
        boolean isMarried= scanner.nextBoolean();
        double taxRate = 0;

        if(salary>=130000){
            taxRate =0.35;
        }else if(salary>=100000 && salary<130000 ){
            taxRate=0.3;
        }else if(salary>=80000 && salary<100000){
            taxRate=0.25;
        }else if (0<salary) {
            taxRate=0.2;
        }

        if(isMarried){
            taxRate-=0.05;
        }

        if(salary<=0){
            System.out.println("Please enter VALID salary!");
        }else{
            System.out.println("Salary after tax= "+ (salary-(salary*taxRate)));
        }

    }


}
