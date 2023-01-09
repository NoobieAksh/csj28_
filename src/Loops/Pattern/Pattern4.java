package Loops.Pattern;
/*
 *     *
 *    **
 *   ***
 *  ****
 * *****

 */
public class Pattern4 {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++) {
            //for spaces
            for(int space=1;space<=5-row;space++){
                System.out.print(" ");
            }
            //for columns.
            for(int col=1;col<=row;col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

