package Method;

import java.util.Scanner;

/*
1. Write a program that takes as input your gross salary and your total saving and uses another function named
   taxCalculator() to calculate your tax.
2. The taxCalculator() function takes as parameters the gross salary as well as the total savings amount.
3. The tax is calculated as follows:

(a) The savings is deducted from the gross income to calculate the taxable income. Maximum deduction of savings
can be Rs. 100,000, even though the amount can be more than this.
(b) For up to 100,000 as taxable income the tax is 0 (Slab 0); beyond 100,000 to 200,000 tax is 10% of the
difference above 100,000 (Slab 1); beyond 200,000 up to 500,000 the net tax is the tax calculated from Slab 0 and
Slab 1 and then 20% of the taxable income exceeding 200,000 (Slab 2); if its more than 500,000, then the tax is
tax from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000.
 */
public class CalculateTax {
    public static void main(String[] args) {
        System.out.println("Enter your gross salary and total saving: ");
        Scanner sc = new Scanner(System.in);
        int grossSalary = sc.nextInt();
        int totalSaving = sc.nextInt();
        CalculateTax.taxCalculator(grossSalary,totalSaving);
    }
    public static int taxCalculator(int grossSalary,int totalSaving){

        return 1;
    }
}
