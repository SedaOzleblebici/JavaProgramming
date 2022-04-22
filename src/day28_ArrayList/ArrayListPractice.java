package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { // i: index numbers of list
            list.set(i ,   list.get(i) *2  );
        }

        System.out.println(list);


    }


}
/*
{1,2,3,4,5,6}
{2,4,6,8,10,12}
 */
/*
Data Structure:
	Array: size is fixed, supports both primitives & non primitives
	Collection: size is dynamic, does not support primitives



ArrayList: part of the collection. internally uses the array


ArrayList Methods:
	add(Data): adds the data after the last index of the ArrayList

	add(index, Data): inserts the data at the given index

	size(): returns the total number of elements

	get(index): returns the element at the given index


	set(index,  Data): replaces the element at given index with the new element.


	remove(int index): removes the element at the given index

	remove(Object): removes the given object from arraylist, returns boolean

	clear(): remove all the elements of the arraylist, size will be 0

	indexOf(Data): returns the first matching element's index number, returns int

	lastIndexOf(Data): returns the last matching element's index number, returns int

	contains(Data): returns true if the element is contained in the arraylist, otherwise returns false

	equals(ArrayList): returns true if two arraylists are equal (same elements in same order), otherwise returns false
 */


