package Loops;
//Take 10 integers from keyboard using loop and print their average value on the screen.

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        System.out.println("How many values you want to insert?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter values: ");
        float sum = 0;
        for(int i=0;i<n;i++) {
            sum += scanner.nextInt();
        }
        float average = sum/n;
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+average);

    }
}
