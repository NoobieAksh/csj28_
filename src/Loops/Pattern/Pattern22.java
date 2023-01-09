package Loops.Pattern;
/*
*          *
*         * *
*        *   *
*       *     *
*      *       *
*     ***********
 */
public class Pattern22 {
    public static void main(String[] args) {
        for(int row=1; row<=6; row++){
            for(int space=1; space<=6-row; space++) {
                System.out.print(" ");
            }
            for(int col=1; col<=(2*row-1); col++) {
                if(col==1 || row==6 || col==(2*row-1)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
