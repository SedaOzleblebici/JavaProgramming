package day14_String;

public class EmailDomain {
    public static void main(String[] args) {

        String email="Cydeo.School@gmail.com";

        //domain: between (@-.) yani=(gmail)

        int beginningIndex= email.indexOf("@")+1;
        int endingIndex=email.lastIndexOf(".");

        String domain=email.substring(beginningIndex,endingIndex);
        System.out.println(domain);

        System.out.println("--------------------------------------------------");

        String  str1="Java is fun, Java is cool";
              //      0123456789

        String  s1= str1.substring(0,10+1);
        System.out.println(s1);










    }


}
