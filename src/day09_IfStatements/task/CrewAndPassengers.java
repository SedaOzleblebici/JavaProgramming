package day09_IfStatements.task;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int number=85;

        String result= "";
        boolean validNumber = number==50 || number==75 || number==100;

        if(validNumber){
            if(number==50){
                result="20 crew,30 passengers";
            }else if(number==75){
                result="25 crew,30 passenger";
            }else{
                result="30 crew";
            }

        }else{
            result = "Invalid Number";
        }
        System.out.println(result);





    }


}
