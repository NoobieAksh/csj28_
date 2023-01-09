package IfElse;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        System.out.println("Enter your marks: ");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if(marks < 25) {
            System.out.println("Your grade is F. ");
        }else if(marks >= 25 & marks < 45) {
            System.out.println("Your grade is E. ");
        }else if(marks >= 45 & marks < 50) {
            System.out.println("Your grade is D. ");
        }else if(marks >= 50 & marks < 60) {
            System.out.println("Your grade is C. ");
        }else if(marks >= 60 & marks <= 80) {
            System.out.println("Your grade is B. ");
        }else {
            System.out.println("Your grade is A. ");
        }
    }
}
