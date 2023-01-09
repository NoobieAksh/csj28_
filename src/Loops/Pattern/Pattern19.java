package Loops.Pattern;
/*
*       1
*      1  2
*     1  2  3
*    1  2  3  4
*     1  2  3
*      1  2
*        1
 */
public class Pattern19 {
    public static void main(String[] args) {
        for(int row=1; row<=4; row++) {
            for(int space=4-row; space>=0; space--){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for(int row=1; row<=3; row++){
            for(int space=0; space<=row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=4-row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
