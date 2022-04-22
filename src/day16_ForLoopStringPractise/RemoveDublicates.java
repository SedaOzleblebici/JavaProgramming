package day16_ForLoopStringPractise;

public class RemoveDublicates {
    public static void main(String[] args) {
        // input: AABBCCBC  output: ABC

        String str="aabbaacc";
        String result="";

        for (int i = 0; i <=str.length()-1 ; i++) {
            String ch= ""+str.charAt(i);
            if(!result.contains(ch)){ // if the character is not contained in the result
                result+= ch;//the character will be added to the result
            }

        }
        System.out.println(result);



    }



}
