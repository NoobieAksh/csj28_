package Loops;
//Write a program in java to find the sum of the even and odd digits of the number which is given as input.
import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfEvenDigits = 0;
        int sumOfOddDigits = 0;
        while(number>0) {
            int lastDigit = number%10;
            if(lastDigit%2==0) {
                sumOfEvenDigits += lastDigit;
            } else {
                sumOfOddDigits += lastDigit;
            }
            number /= 10;
        }
        System.out.println("Sum of even digits:"+sumOfEvenDigits);
        System.out.println("Sum of odd digits:"+sumOfOddDigits);
    }
}
