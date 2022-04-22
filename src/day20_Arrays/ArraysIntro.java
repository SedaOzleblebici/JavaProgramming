package day20_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that is capable enough to contain 5 names

        String[] names=new String[5];
        names[0]="Ali";
        names[1]="veli";
        names[2]="deli";
        names[3]="zeli";
        names[4]="heli";

        //System.out.println(names); // hashcode

        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------------");

        String[] days={"mon", "tue", "wed","thu","fri","sat","sun"};
        //index          0      1      2     3     4     5      6
        System.out.println(Arrays.toString(days));

        int number=5;
        if (number<1 || number>7){
            System.err.println("invalid");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("--------------------------------------------------");
        int [] arr1={1,3,2};
        int [] arr2={1,2,3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2= Arrays.equals(arr1,arr2);
        System.out.println(r2);




    }


}
