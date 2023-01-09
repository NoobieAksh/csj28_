package Loops;
//Calculate the sum of digits of a number given by user.

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        while (number>0) {
            int lastDigit = number%10;
            number /= 10;
            sumOfDigits += lastDigit;
        }
        System.out.println("Sum Of Digits: "+sumOfDigits);
    }
}
