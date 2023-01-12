package Method;

import java.util.Scanner;

/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also,
1! = 1
0! = 0
*/
public class Factorial {
    static int fact(int number){
        int fact = 1;
        for(int i =1; i<=number; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Factorial is: "+Factorial.fact(number));
    }
}
