package day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {

         int hourlyRate= 50;
         int weeklyHours = 45;
         double stateTaxRate = 6.5;
         double federalTaxRate= 26.2;

         int  salaryBeforeTax= (hourlyRate*weeklyHours*52);
         double stateTax= (salaryBeforeTax*stateTaxRate/100);
         double federalTax= (salaryBeforeTax*federalTaxRate/100);
         double totalTax =(stateTax+federalTax);
         double salaryAfterTax = salaryBeforeTax-totalTax ;

        System.out.println("salaryAfterTax = $"+ salaryAfterTax);
        System.out.println("salaryBeforeTax = $"+ salaryBeforeTax);
        System.out.println("stateTax = $"+stateTax);
        System.out.println("federalTax = $"+ federalTax);
        System.out.println("totalTax = $"+ totalTax);
        System.out.println("Net income= $"+ salaryAfterTax);





         }


    }



