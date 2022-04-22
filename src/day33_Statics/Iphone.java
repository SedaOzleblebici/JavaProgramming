package day33_Statics;

public class Iphone {
    public static String brand = "Apple";

    public String model;
    public double price;

    public static String OS = "iOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(OS);
    }


    // public static void printModelAndPrice(){
    //    System.out.println(model+" : "+price); // static methods does not accept instances
    //  }


    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }
/*
instance: belong to the object
		each object has its own copy of the instances (can have multiple copies)


static: belongs to the class.
		There is only one copy os statics that's shared by all objects of the class

 */



}
