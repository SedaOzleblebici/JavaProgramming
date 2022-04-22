package day27_WrapperClasses;

public class UpperLowerEqual {
    public static void main(String[] args) {
        String str = "JAVA java";
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each)) {
                countUpper++;
            }

            if (Character.isLowerCase(each)) {
                countLower++;
            }

        }
        boolean result = countLower == countUpper;
        System.out.println(result);


    }
}