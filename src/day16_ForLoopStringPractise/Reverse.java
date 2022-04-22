package day16_ForLoopStringPractise;

public class Reverse {   // tersten demek
    public static void main(String[] args) {

          // ex:
          //  input:  Wooden Spoon  output: noopS nedooW

        String str= "Wooden Spoon";
        //index:     0123456..

        String result="";

      //  result +=str.charAt(str.length()-1);  //n

        for (int i = str.length()-1; i >=0; i--) { // i= index numbers os str
            result += str.charAt(i); // adding each character to result


        }
        System.out.println(result);




    }


}
