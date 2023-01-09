package Loops.Pattern;
/*
*        1
*       22
*      333
*     4444
*    55555

*/
public class Pattern11 {
    public static void main(String[] args) {
        for(int row=1; row<=5; row++) {
            for(int space=5-row;space>0;space--) {
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}

