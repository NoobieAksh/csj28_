package Loops.Pattern;
/*
*     1
*    12
*   123
*  1234
* 12345

*/
public class Pattern10 {
    public static void main(String[] args) {
        for(int row=1; row<=5; row++) {
            for(int space=5-row;space>0;space--) {
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
