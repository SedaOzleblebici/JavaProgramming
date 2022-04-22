package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        String str="cccccccddddaaaaabbbbbb";
       str=removeDublicates(str);
        System.out.println(str);
    }
    public static String removeDublicates(String str){ //"aaabbcc" ==>"abc"
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if (!result.contains(""+each)){
                result+=each;
            }


        }

        return result;
    }


}
