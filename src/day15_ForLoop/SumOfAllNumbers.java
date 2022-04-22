package day15_ForLoop;

public class SumOfAllNumbers {
    public static void main(String[] args) {
    /*3. write a program that can calculate the sum of all numbers between
1 to any given number
ex:
input: 100
output: 5050
input: 50
output: 1275

     */
        int givenNumber=50;
        int sum=0;
        for (int i = 1; i <= givenNumber; i++) {
            sum+=i;
        }
        System.out.println(sum);



    }


}



