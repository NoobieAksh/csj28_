package Loops;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int i;
        if(number1>number2) {
             i = number2;
        }else {
             i = number1;
        }
        for(; i>0; i--) {
            if(number1%i==0 && number2%i==0) {
                number1 /= i;
                number2 /= i;
            }
        }
        System.out.println(number1+ "/"+number2);

    }
}
