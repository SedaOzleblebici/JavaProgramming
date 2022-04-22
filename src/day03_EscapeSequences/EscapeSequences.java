package day03_EscapeSequences;
/*
Escape Sequences: MUST be given with double quote
  \n: starts a new line
  \t:tab
  \\:single back slash
  \":double quote
 */


public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("java \nPyton  \nC#");
        System.out.println("\tjava is cool programming language");
        System.out.println("/\\"); //in order to print one backward slash
        // we need to give two backward slashes
        System.out.println("my name is \"seda\"");
        //in order to print double qoute, we need to use \" x \"
    }


}
