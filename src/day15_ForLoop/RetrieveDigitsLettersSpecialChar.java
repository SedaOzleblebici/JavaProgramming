package day15_ForLoop;

public class RetrieveDigitsLettersSpecialChar {
    public static void main(String[] args) {
/*Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!

 */
        String letters="";
        String digits="";
        String specialCharacters="";
        String str="Cydeo12345School!@#$%WoodenSpoon";

        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch= str.charAt(i);
            if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
                letters += ch;
            }else if( ch>=48 && ch<=57){
                digits +=ch;
            }else{
                specialCharacters += ch;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);;

    }


}
