package day17_While_DoWhile;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        int number=100;
        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";

        for (int i = 1; i < number; i++) {
            if (i%15==0){
                divisibleBy15 +=i+" ";
            }
            if (i%3==0 && i%15!=0){
                divisibleBy3 +=i+" ";
            }
            if (i%5==0 && i%15!=0){
                divisibleBy5 +=i+" ";
            }

        }
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy15 = " + divisibleBy15);





    }


}
