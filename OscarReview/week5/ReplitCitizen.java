package week5;

import java.util.Scanner;

public class ReplitCitizen {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int seniorCitizens,nonSeniorCitizen,age;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens = scan.nextInt();
        nonSeniorCitizen = scan.nextInt();
        System.out.println("What is new citizen's age?");
        age = scan.nextInt();

        if(age>=65){
            seniorCitizens++;
            System.out.println("Senior Citizen");
        }else{
            nonSeniorCitizen++;
            System.out.println("Non-Senior Citizen");
        }

        System.out.println("New seniorCitizens "+seniorCitizens);
        System.out.println("New nonSeniorCitizens " +nonSeniorCitizen);











    }


}
