package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year=2000;
        int number=2; //1-12
        String result="";

        if (number>=1 && number<=12){
            switch (number){
                case 2:
                    result= (year%4==0)?"29 Days": "28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    result="30 days";
                default:
                    result="31 days";

            }


        }else {
            result= "invalid number";
        }


        System.out.println(result);





    }


}
