package day09_IfStatements.task;

public class LeapYearPractise {
    public static void main(String[] args) {
        /*
        Write a program to check if a year is leap year or not.
        If a year is divisible by 4 then it is leap year but if the year is century year
        like 2000, 1900, 2100 then it must be divisible by 400.
         */

        int year= 1900;

        /*
        if (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)

        {
            println(year + " is a leap year.");
        } else
        println(year + " is not a leap year.");

        */

        if(year %4==0 &&year%100!=0||year%400==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }










    }


    }



