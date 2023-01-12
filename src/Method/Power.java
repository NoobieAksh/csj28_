package Method;
//Define a method to calculate power of a number raised to other i.e. ab

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println("Enter the values of a and b resp.: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Power.powerOf(a,b);
    }
    static void powerOf(int a,int b){
        int prod = 1;
        for(int i=1; i<=b; i++){
            prod *= a;
        }
        System.out.println("Answer: "+prod);
    }
}
