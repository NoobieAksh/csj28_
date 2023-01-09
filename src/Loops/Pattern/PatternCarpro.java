package Loops.Pattern;
/*
*  5 4 3 2 1 2 3 4 5
*  4 3 2 1   1 2 3 4
*  3 2 1       1 2 3
*  2 1           1 2
*  1               1
*
 */

public class PatternCarpro {
    public static void main(String[] args) {
        for(int row=5; row>=1; row--){
            for(int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int space=5-row; space>0;space--){
                System.out.print("_ ");
            }
            for(int space=4-row; space>0; space--){
                System.out.print("_ ");
            }
            for(int col=1; col<=row; col++){
                if(col==1 && row==5){
                    continue;
                }
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
