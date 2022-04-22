package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", };
        ArrayList<String> list= new ArrayList<>(Arrays.asList(countries));


        ArrayList<Integer> list2= new ArrayList<>();
//        list2.add(1);
//        list2.add(2);

        list2.addAll(Arrays.asList(1,2,3,4,5));

        list2.set(0,list2.get(4));
        list2.set(4,list2.get(0));

        System.out.println("list2 = " + list2);
list2.containsAll(Arrays.asList(1));
//
//        Integer a=1;
//
//        System.out.println(list2.remove(a));

        // list.a

        System.out.println(list2);

        list.add(0,"aa");

        System.out.println(list);
    }


}
