package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName ="chrome";
        String result ="";
        boolean validBrowser= browserName == "chrome" || browserName=="firefox"
                || browserName=="opera" ||browserName=="safari"|| browserName=="edge";

        if(validBrowser){
            if(browserName=="chrome"){
                result= "Chrome is selected";
            }else if(browserName=="firefox"){
                result="Firefox is selected";
            } // diye devm eder





        }else {
            result= "Invalid Browser Name";
        }

        System.out.println(result);




    }


}
