package day09_IfStatements;

public class PassOrFail {

    public static void main(String[] args) {
        int n= 75;
        /*

        if(n>=0 && n<=100){

            if(n>=60){
                System.out.println("Congrats, you passed");
            }else{
                System.out.println("Failed");
            }



        }else {
            System.out.println("Invalid number");
        }

         */


        String result =(n>=0 && n<=100)? (n>=60)? "Congrats, you passed" : "Failed" : "Invalid number";
        System.out.println(result);

        //ternaries











    }

}
