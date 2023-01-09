package Loops;

import java.util.Scanner;

public class PerfectNumberUser {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for(int i=1; i<=number/2; i++) {
            if (number % i == 0) {
                System.out.println("Factor: " + i);
                sum += i;
            }
        }
        System.out.println(sum==number?"Its perfect number.":"Its not perfect.");
    }
}
