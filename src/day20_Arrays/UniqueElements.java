package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words={"java","java","C#","Python","Python"};
      /*
        for (int j = 0; j < words.length; j++) {
            String element=words[j];
            int frequency=0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)){
                    frequency++;
                }
            }

            if (frequency==1){
                System.out.println(element);
            }
        }

       */

        for (String word : words) {
            int count=0;
            for (String s : words) {
                if (s.equals(word)){
                    count++;
                }

            }
           if (count==1){
               System.out.println(word);
           }
        }





    }


}
