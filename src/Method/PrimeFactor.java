package Method;
//Define a method to print the prime factors of a number.

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        PrimeFactor.primeFactorOfNumber(number);
    }
    public static void primeFactorOfNumber(int number){
        //First we will find factors of a number.
        for(int i=1; i<=number/2; i++){
            if (number%i == 0){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean isPrime(int number){
        boolean isPrime = true;
        if(number<=1){
            return false;
        }
        for (int j=2; j<= number/2; j++){
            if(number%j == 0){
                return false;
            }
        }
        return isPrime;
    }

}
