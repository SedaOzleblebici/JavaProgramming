package ReplitStudies;

public class PrintEvenFrom80to20 {
    public static void main(String[] args) {

        String str="";

        for (int i = 80; i >=20 ; i-=2) {

            if(i!=20) {
                str = str + i+ " " ;
            } else {
                str = str + i ;
            }

            }
        System.out.println(str);

        }





    }


