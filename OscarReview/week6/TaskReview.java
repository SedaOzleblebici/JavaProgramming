package week6;

public class TaskReview {
    public static void main(String[] args) {
       /*  Print below pattern using loop

        1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14 15

        */

        int rowCount = 5;

        for (int row = 1; row <= rowCount; row++) {
            int value = row;

            for (int col = 1; col <=row ; col++) {
                System.out.print(value +" ");
                value += rowCount -col;
            }
            System.out.println();
        }



    }


}
