package IfElse;
// Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        System.out.println("Enter length and breadth: ");
        Scanner obj1 = new Scanner(System.in);
        int length = obj1.nextInt();
        int breadth = obj1.nextInt();
        if(length==breadth) {
            System.out.println("Its Square");
        } else {
            System.out.println("Its Rectangle");
        }
    }
}
