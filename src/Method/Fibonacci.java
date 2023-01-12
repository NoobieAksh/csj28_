package Method;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter nth term: ");
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        Fibonacci.fibbonacciNthTerm(number);
    }
    public static void fibbonacciNthTerm(int number){
        int sum = 0;
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        for(int i=3; i<=number; i++){
            sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
        System.out.println();
        System.out.println(number+"th term of fibonacci series is: "+sum);

    }
}
