package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name ="Steven";
        int age = 19;
        String  citizen = "USA";

        boolean isEligible = age >= 18 && citizen== "USA";

        System.out.println(name + " is eligible to vote: "+ isEligible);
        System.out.println("-------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3>= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3+ " is eligible to register: "+ isEligible3);












    }


}
