package week2;

public class CarInfo {

    public static void main(String[] args) {

            int year = 2022;
            String make = "Audi";
            String model= "A6";
            boolean transmission = true;
            String color = "Black";
            int milage = 0;
            long price = 100_000;

        System.out.println(year+ " "+ make+ " "+model+"\nAutomatic Transmission :"+transmission);

           double priceInTL = price * 15.5; // 1 euro= 15.5 tl
           
           double taxRate = 1.80; // for this kind of cars
         
         double priceAfterTaxInTL = priceInTL + (priceInTL*taxRate);

        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);




    }



}
