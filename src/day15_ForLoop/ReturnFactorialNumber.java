package day15_ForLoop;

public class ReturnFactorialNumber {
    public static void main(String[] args) {
/*Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
        int result=1;
        int givenNumber=5;
        for (int i = givenNumber; i >=1 ; i--) {
            result *= i;
        }
        System.out.println(result);



    }


}
