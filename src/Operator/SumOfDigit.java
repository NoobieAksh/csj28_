package Operator;
//Write a program to calculate the sum of the digits of a 3-digit number.
//Number : 132 Output : 6

public class SumOfDigit {
    public static void main(String[] args) {
        int number = 132;
        int lastDigit = number%10;
        number = number/10;
        int secondDigit = number%10;
        number = number/10;
        int firstDigit = number%10;
        number = number/10;
        int sumOfEveryDigit = firstDigit+secondDigit+lastDigit;
        System.out.println("Sum Of each digit in number: "+sumOfEveryDigit);


    }
}
