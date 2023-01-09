package Operator;
//Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231

public class ReverseOfThreeDigit {
    public static void main(String[] args) {
        int number = 132;
        int lastDigit = number%10;
        number = number/10;
        int seconDigit = number%10;
        number = number/10;
        int firstDigit = number%10;
        number = number/10;
        System.out.println("Reverse is:"+lastDigit + seconDigit + firstDigit);


    }
}
