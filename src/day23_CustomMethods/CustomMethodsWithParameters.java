package day23_CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        //  oddOrEven(); the methods demands additional info to complete its task
        oddOrEven(10);

    }
        public static void oddOrEven ( int number){
            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            } else {
                System.out.println(number + " is odd number");
            }
        }


}
