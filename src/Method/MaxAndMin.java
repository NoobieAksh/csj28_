package Method;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user

import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        MaxAndMin ref = new MaxAndMin();
        System.out.print("max: ");
        ref.maximum(number1,number2,number3);
        System.out.print("min: ");
        ref.minimum(number1,number2,number3);

    }

    void maximum(int number1, int number2,int number3){
        if(number1>=number2 && number1>=number3)
        {
            System.out.println(number1);
        } else if (number2>=number1 && number2>=number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }

    void minimum(int number1, int number2,int number3){
        if(number1<=number2 && number1<=number3)
        {
            System.out.println(number1);
        } else if (number2<=number1 && number2<=number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }
}
