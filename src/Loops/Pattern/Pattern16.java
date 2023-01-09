package Loops.Pattern;
/*
 *       *
 *      * *
 *     * * *
 *    * * * *
 *     * * *
 *      * *
 *       *

 */
public class Pattern16 {
    public static void main(String[] args) {
        for(int row=1 ;row<4; row++) {
            for(int space=5-row; space>0; space--) {
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++) {
                System.out.print("* ");
            }
             System.out.println();
        }
        for(int row=1; row<=4; row++) {
            for(int space=0;space<row;space++) {
                System.out.print(" ");
            }
            for (int col=4;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


