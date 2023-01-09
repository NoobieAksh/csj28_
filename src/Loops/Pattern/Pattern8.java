package Loops.Pattern;
/*
 *   1
 *   2 3
 *   4 5 6
 *   7 8 9 10
 *
 * */
public class Pattern8 {
    public static void main(String[] args) {
        int counter = 1;
        for(int row=1; row<=4; row++) {
            for (int col=1;col<=row;col++){
                System.out.print(counter++ +" ");
            }
            System.out.println();
        }
    }
}
