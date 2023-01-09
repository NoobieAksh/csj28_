package Loops;
//Print factors of a number.

import java.util.Scanner;

public class factorOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner obj1 = new Scanner(System.in);
        int number = obj1.nextInt();
        for(int i=1;i<=number/2;i++){
            int remainder= number%i;
            if(remainder==0){
                System.out.println(i);
            }
        }
    }
}
