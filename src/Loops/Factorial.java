package Loops;
//Write a Java program to calculate factorial of a number.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for(int i=1;i<=number;i++){
            factorial *= i;
        }
        if (number==0) {
            System.out.println("Factorial is : " + factorial);
        } else {
            System.out.println("Factorial is : " + factorial);
        }
    }
}
