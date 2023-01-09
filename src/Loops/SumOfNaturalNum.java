package Loops;
//Write a program to calculate the sum of first 10 natural number.

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int sumOfNumber = 0;
        for(int i=1; i<=10; i++){
            sumOfNumber += i;
        }
        System.out.println("Sum of First 10 Natural Number: "+sumOfNumber);
    }
}
