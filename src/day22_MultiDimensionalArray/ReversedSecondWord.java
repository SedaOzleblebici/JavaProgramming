package day22_MultiDimensionalArray;

public class ReversedSecondWord {
    public static void main(String[] args) {
        // sentence="I Love Java";
        // output: I evoL Java

        String sentence="I Love Java";
        String [] words= sentence.split(" ");

        String reversed ="";
        for (int i = words[1].length() - 1; i >= 0; i--) {
            reversed+=words[1].charAt(i);

        }
        System.out.println(reversed);

        sentence=sentence.replaceFirst(words[1],reversed);
        System.out.println(sentence);




    }


}
