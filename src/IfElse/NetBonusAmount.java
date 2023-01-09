package IfElse;

import java.util.Scanner;

public class NetBonusAmount {
    public static void main(String[] args) {
        System.out.println("Enter year of service:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year > 5) {
            System.out.println("Enter your salary: ");
            float salary = scanner.nextFloat();
            float bonusPerSalary = salary/2f;
            float netBonus = salary + bonusPerSalary;
            System.out.println("Net Bonus amount is: "+ netBonus);
        }else {
            System.out.println("You are not eligible for bonus");
        }
    }
}
