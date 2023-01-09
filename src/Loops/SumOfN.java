package Loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println("How many elements you want to insert:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOfNumber = 0;
        for(int i=1; i<=n; i++){
            int Number = scanner.nextInt();
            sumOfNumber += Number;
        }
        System.out.println("Sum Of Numbers is:"+sumOfNumber);
    }
}
