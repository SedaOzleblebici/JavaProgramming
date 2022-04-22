package day24_CustomMethods_Return;

public class tlh {


    public static void main(String[] args) {


//        int a=5;
//        int b=1;
//
//        System.out.println(a+" nin " + b + " ye bolumunden kalan: " + (a%b));
//
//        a=10;
//        b=3;
//
//        System.out.println(a+" nin " + b + " ye bolumunden kalan: " + (a%b));
//
//        a=11;
//        b=2;
//
//        System.out.println(a+" nin " + b + " ye bolumunden kalan: " + (a%b));



        int kalanSayisa = kalanHesapla(5,2);

    }

    public static int kalanHesapla(int a, int b){
        int kalan=(a%b);
     //   System.out.println(a+" nin " + b + " ye bolumunden kalan: " + kalan);
        return kalan;

    }
}
