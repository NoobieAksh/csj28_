package Method;

import java.util.Scanner;

/*
Write a program to print the sum of two numbers entered by user by defining your own method.
 */
public class SumOfTwoNumbers {
    int number1, number2;
    void sum(int number1,int number2){
        int sumOfNumbers = number1+number2;
        System.out.println("Sum: "+sumOfNumbers);
    }

    public static void main(String[] args) {
        System.out.println("Enter two nubers");
        Scanner sc = new Scanner(System.in);
        SumOfTwoNumbers ref = new SumOfTwoNumbers();
        ref.number1 = sc.nextInt();
        ref.number2 = sc.nextInt();
        ref.sum(ref.number1, ref.number2);
    }
}
