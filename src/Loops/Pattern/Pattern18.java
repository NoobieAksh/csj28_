package Loops.Pattern;
/*
 *          1
 *         2  2
 *        3  3  3
 *       4  4  4  4
 *      5  5  5  5  5
 */
public class Pattern18 {
    public static void main(String[] args) {
        for(int row=1; row<=5; row++) {
            for(int space=1; space<=5-row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++) {
                System.out.print(row+" ");
            }
            System.out.println();

        }
    }
}
