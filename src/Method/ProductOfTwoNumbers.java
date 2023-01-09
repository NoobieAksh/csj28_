package Method;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    int number1, number2;
    int product(int number1,int number2){
        return number1 * number2;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        ProductOfTwoNumbers ref = new ProductOfTwoNumbers();
        ref.number1 = sc.nextInt();
        ref.number2 = sc.nextInt();
        System.out.println("Product: "+ref.product(ref.number1, ref.number2));
    }
}

