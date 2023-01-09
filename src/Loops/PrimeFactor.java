package Loops;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner obj1 = new Scanner(System.in);
        int number = obj1.nextInt();
        System.out.println("Prime Factors are:");
        for (int i = 1; i <= number/2; i++) {
            int rem = number%i;
            boolean isPrime = true;
            if (i<2){
                continue;
            }
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (rem==0 && isPrime){
                System.out.println(i);
            }
        }
    }

}
