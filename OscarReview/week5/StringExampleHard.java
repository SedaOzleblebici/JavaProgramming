package week5;

import java.util.Scanner;

public class StringExampleHard {
    public static void main(String[] args) {
       /* Your team has created a new bank website that requires email address to be validated.
        The email string must contain an '@' character.
                The email string must contain an '.' character.
                The '@' must contain at least one character in front of it.
        e.g. "a@example.com" is valid while "@example.com" is invalid.
        The '.' and '@' must be in the appropriate places.
        e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
        For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
                Examples:
        str = "test@example.com" --> true
        str = "test@example.co.in --> true
        str = "@example.com" --> false


       */

        Scanner scanner = new Scanner(System.in);
      String email= scanner.next();
      String result="";

      if( !(email.contains("@") && email.contains("."))){
          result = "INVALID";
      } else if(email.indexOf("@")!= email.lastIndexOf("@")){
          result = "INVALID";
      } else if(email.charAt(0)=='@'){
          result="INVALID";
      } else if(!(email.substring( email.indexOf("@")+1,email.length()-1).contains("."))){
          result="INVALID";
      }else{
          result="VALID";
      }

      System.out.println(result);





    }


}
