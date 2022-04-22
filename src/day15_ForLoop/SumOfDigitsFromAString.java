package day15_ForLoop;

public class SumOfDigitsFromAString {
    public static void main(String[] args) {
/* Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

 */
        String str="A1B2C3";
        int sum=0;

        for (int i = 0; i <=str.length()-1 ; i++) {
            char ch=str.charAt(i);
            if(ch>=48 && ch<=57){
                sum += ch - 48;

              /*  String temp= str.substring(i,i+1);
                System.out.println("temp = " + temp);

                sum +=  Integer.parseInt(temp);

               */
            }

        }
        System.out.println(sum);




    }


}
