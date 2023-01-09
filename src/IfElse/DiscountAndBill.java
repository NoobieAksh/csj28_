package IfElse;
//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.

import java.util.Scanner;

public class DiscountAndBill {
    public static void main(String[] args) {
        System.out.println("Enter quantity and cost:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int costPerQuantity = scanner.nextInt();
        int purchaseAmount = quantity*costPerQuantity;
        if (purchaseAmount > 1000) {
            float discountAmount = purchaseAmount*0.1f;
            float totalAmount = purchaseAmount-discountAmount;
            System.out.println("Total Bill is:"+totalAmount);
            System.out.println("Discount is:"+discountAmount);

        } else {
            System.out.println("Total Bill is:"+purchaseAmount);
        }
    }
}
