package week6;

public class BasicLoopExamples {
    public static void main(String[] args) {
        /*
         * Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000


         */
        for(int i=0  ;  i<=1000   ;  i+=10 ){
            System.out.print(i+" ");
        }
        System.out.println();
        //==================================
        // initialization
        int z = 0;
        for(  ; z <= 1000 ;  ){
            if(z%10==0) {
                System.out.print(z + " ");
            }
            z++;
            // z+=10;  // iteration
        }
    }
    /*
     * Question-2:

     Write a program that
     displays all odd numbers between 3-130
     in the same line


        for (int i = 3; i < 130 ; i += 2){
        System.out.print(i+" ");

     */

    }







