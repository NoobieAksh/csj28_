package Loops;
//Write a program to print all prime number in between 1 to 100.

public class PrimeInRange {
    public static void main(String[] args) {
        for(int number=1; number<=100; number++){
            if(number<2){
                continue;
            }
            boolean isPrime = true;
            for(int i=2;i<=number/2;i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number);
            }



        }
    }
}
