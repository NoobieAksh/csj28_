package Method;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Prime : "+prime(number));

    }
    static boolean prime(int number){
        boolean isPrime = true;
        for (int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return isPrime;

    }
}
