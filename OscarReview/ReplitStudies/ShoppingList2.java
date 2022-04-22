package ReplitStudies;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("ENTER ITEM"+count+" and its price:");
            item=scan.nextLine();
            price=scan.nextDouble();
            shoppingListReport +="Item"+count+": "+" Price: "+ price+",";
            count++;
            totalPrice+=0;
            System.out.println("add one more item?");
            scan.nextLine();
            countinue=scan.nextLine();
        }
        while (countinue.equalsIgnoreCase("yes"));
        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-1));
        System.out.println("Total price="+ totalPrice);



      




    }


}
