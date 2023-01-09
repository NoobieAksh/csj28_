package ClassAndObject;

import java.util.Scanner;

/*
Print the average of three numbers entered by user by creating a class named 'Average'
having a method to calculate and print the average
 */
public class Average {
    void calculate(int number1, int number2, int number3){
        float average = (float)(number1+number2+number3)/3;
        System.out.println("Average of three numbers is: "+average);
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        Average ref = new Average();
        ref.calculate(number1,number2,number3);
    }
}
