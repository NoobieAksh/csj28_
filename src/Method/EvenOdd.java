package Method;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class EvenOdd {
    int number;

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        EvenOdd ref = new EvenOdd();
        ref.number = sc.nextInt();
        EvenOdd.evenOrOdd(ref.number);
    }
    static void evenOrOdd(int number){
        String result = (number%2==0) ? "Even" : "Odd";
        System.out.println("Number is "+result);
    }
}
