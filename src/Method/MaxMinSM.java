package Method;

import java.util.Scanner;

public class MaxMinSM {
    static int maximum(int num1,int num2,int num3){
        if(num1>=num2 && num1>=num3)
        {
            return num1;
        } else if (num2>=num1 && num2>=num3) {
            return num2;
        } else {
            return num3;
        }
    }
    static int minimum(int num1,int num2,int num3){
        if(num1<=num2 && num1<=num3)
        {
            return num1;
        } else if (num2<=num1 && num2<=num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = MaxMinSM.maximum(num1,num2,num3);
        int min = MaxMinSM.minimum(num1,num2,num3);
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }
}
