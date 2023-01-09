package Operator;
//Write a program to calculate the sum of the first and the second last digit of a 5 digit number.
//
//E.g.- NUMBER : 12345 OUTPUT : 1+4=5

public class SumOfFirstAndSecondLast {
    public static void main(String[] args) {
        int number = 12345;
        int lastDigit = number%10;
        number = number/10;
        int secondLastDigit = number%10;
        number = number/10;
        int thirdDigit = number%10;
        number = number/10;
        int secondDigit = number%10;
        number = number/10;
        int firstDigit = number%10;
        int summationOfDigits = firstDigit+secondLastDigit;
        System.out.println("Sum is: "+summationOfDigits);
    }
}
