package day36_Inheritance.encapculation;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Daniel", 29, 'M', 'D', "MIT");
        student1.setAge(39);
        System.out.println(student1);

/*
Encapsulation: hiding the fields by giving private access modifiers
 use getter/setter to read/write the private data


Getter (Read Only): public instance method
Return type is not void
			   Return type must match with private instance variable' data type
			  			Does not pass any parameter
			  			 Returns the private instance variables value

Setter (Write Only): public instance method
			  		 Return type is void
			  		 Passes a parameter
			   Parameter' data type must match with private instance variable' data type
			  	 reassigns the private instance variable to given argument


use the data:
	1. read
	2. write


 */

    }


}
