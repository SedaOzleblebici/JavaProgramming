package day28_ArrayList;

import day08_IfStatement.SingleIfStatementsIntro;
import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTowArraysTask {
    public static void main(String[] args) {
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
       /* String [] arr1={"A", "B", "C"};
        String [] arr2={"D", "E", "F", "G"};
        String [] list= ArraysUtility.merge(arr1,arr2);
        System.out.println(Arrays.toString(list));

        */
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list= new ArrayList<>();

        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);
        }

        System.out.println(list);






    }


}
