package Inheritance.Question2;

import java.util.Scanner;

public class WageEmployee extends Employee{
    public static String name;

    public static void main(String[] args) {
        WageEmployee ref = new WageEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        WageEmployee.name = sc.next();
        System.out.println("Enter number of hours and rate per hour: ");
        int hrs = sc.nextInt();
        int rate = sc.nextInt();
        System.out.println("Employee name: "+WageEmployee.name);
        System.out.println("Salary: "+ref.computeSalary(hrs,rate));

    }
}
