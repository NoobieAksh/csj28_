package Loops;

import java.util.Scanner;

public class GCDProgram {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int gcd = 1;
        for(int i=1; i<=number1 && i<=number2; i++) {
            if(number1%i==0 && number2%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD is: "+gcd);
    }
}
