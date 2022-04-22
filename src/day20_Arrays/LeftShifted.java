package day20_Arrays;

import java.util.Arrays;

public class LeftShifted {
    public static void main(String[] args) {
           /*
        Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
        You may modify and print the given array, or print a new array.`
Example:

input: 6, 2, 5, 3

output: [2, 5, 3, 6]
         */

        int [] array = {6, 2, 5, 3};

        int [] newArray= new int[array.length];

        // this loop for assign i. elements to i-1 in new array
        for (int i = 1; i < array.length; i++) {
            newArray[i-1]= array[i];
        }
        //then assign 0. index to last index in new array
        newArray[array.length-1]=array[0];

        System.out.println(Arrays.toString(newArray));

    }


}
