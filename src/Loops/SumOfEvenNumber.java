package Loops;
//write a program to find the sum of first n even numbers

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter nth element:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOfEven = 0;
        for(int number=1; number<=n; number++){
            if(number%2 == 0){
                System.out.print(number+" ");
                sumOfEven += number;
            }
        }
        System.out.println();
        System.out.println("Sum of even number is: "+sumOfEven);
    }
}
