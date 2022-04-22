package week5;

import java.util.Scanner;

public class ReplitPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        String result="";



        if(num>0){
            result="Positive";
        }else if(num<0){
            result="Negative";
        }else{
            result="Zero";
        }

        System.out.println(result);
        s.close();




    }


}
