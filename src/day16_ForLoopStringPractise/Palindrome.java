package day16_ForLoopStringPractise;


public class Palindrome {
    public static void main(String[] args) {
        // "Anna" is palidrome-tersten de okununca aynı
        String word="Level";
        String reversed="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed +=word.charAt(i);
        }
        
        boolean isPalindrome= word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);;
        
        
    }
    
    
}
