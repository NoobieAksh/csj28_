package Loops.Pattern;
/*
*  5 5 5 5 5
*   4 4 4 4
*    3 3 3
*     2 2
*      1
 */
public class Pattern21 {
    public static void main(String[] args) {
        for(int row=1; row<=5; row++) {
            for(int space=1; space<row ;space++) {
                System.out.print(" ");
            }
            for(int col=6-row; col>=1; col--){
                System.out.print(6-row+" ");
            }
            System.out.println();
        }
    }
}
