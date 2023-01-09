package IfElse;
//Take two int values from user and print greatest among them.

import java.util.Scanner;
public class GreaterOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter two number:");
        Scanner obj1 = new Scanner(System.in);
        int number1 = obj1.nextInt();
        int number2 = obj1.nextInt();
        if(number1 > number2) {
            System.out.println(number1+" is greater");
        } else {
            System.out.println(number2+" is greater");
        }
    }
}
