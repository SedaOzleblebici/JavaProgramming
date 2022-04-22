package day18_NestedLoop;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NestedLoopsPractise {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){

            System.out.println("enter your age");
        int age=scan.nextInt();

        while (!(age>=1 && age<=120)){
            System.err.println("Invalid entry.re enter ");
            age=scan.nextInt();
        }
        System.out.println("would you like to continue?");
        String a=scan.next().toLowerCase();

        while (!(a.equals("yes")|| a.equals("no"))){
            System.err.println("Invalid Entry,please re enter.would you like to continue?");
            a=scan.next().toLowerCase();
        }
        if (a.equals("no")){
            break;
        }


        }
        scan.close();





    }


}
