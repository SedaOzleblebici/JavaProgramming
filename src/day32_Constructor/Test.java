package day32_Constructor;

public class Test {
    public  Test(){ //A
        System.out.println("A");
    }

    public Test(int a){ //A  B
        this();
        System.out.println("B");
    }

    public Test(double a){ //A B C
        this(10);
        System.out.println("C");
    }

    public Test(String str){ // A B C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {

        new Test("Java");

    }


}
/*
     this: refers to the instances

	this. : to call instance variables & instance methods
	this() : used for calling the constructors


Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself

 */