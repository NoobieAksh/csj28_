package Loops;
//Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ).
// Print average and product of all numbers.

import java.util.Scanner;

public class QtoQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int prod = 1;
        char quit = scanner.next().charAt(0);
        for(int i = 1; i>0; i++){
            System.out.println("Enter an integer value: ");
            int number = scanner.nextInt();
            sum += number;
            prod *= number;
            System.out.println("Press q to quit.");
            if(quit == 'q'){
                break;
            }

        }
        System.out.println(sum);


    }
}
