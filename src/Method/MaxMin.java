package Method;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        MaxMin ref = new MaxMin();
        int max = ref.maximum(num1,num2,num3);
        int min = ref.minimum(num1,num2,num3);
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
    int maximum(int num1, int num2, int num3){
        if(num1>num2 && num1>num3)
        {
            return num1;
        } else if (num2>num1 && num2>num3) {
            return num2;
        } else {
            return num3;
        }
    }
    int minimum(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
