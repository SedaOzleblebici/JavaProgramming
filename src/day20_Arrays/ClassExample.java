package day20_Arrays;

import java.util.Arrays;

public class ClassExample {
    public static void main(String[] args) {
        /*
        Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
        You may modify and print the given array, or print a new array.`
Example:

input: 6, 2, 5, 3

output: [2, 5, 3, 6]
         */

        int [] array = {6, 2, 5, 3};

        leftShiftedPrint(array);
        System.out.println(Arrays.toString(leftShifted(array)));
    }


    public static int[] leftShifted(int[]array){

        int arraySize=array.length;
        int [] newArray= new int[arraySize];

        // this loop for assign i. elements to i-1 in new array
        for (int i = 1; i < array.length; i++) {
            newArray[i-1]= array[i];
        }
        //then assign 0. index to last index in new array
        newArray[arraySize-1]=array[0];

        return newArray;
    }
    public static void leftShiftedPrint(int[]array){

        int arraySize=array.length;
        int [] newArray= new int[arraySize];

        // this loop for assign i. elements to i-1 in new array
        for (int i = 1; i < array.length; i++) {
            newArray[i-1]= array[i];
        }
        //then assign 0. index to last index in new array
        newArray[arraySize-1]=array[0];

        System.out.println(Arrays.toString(newArray));

    }



}
