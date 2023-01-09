package Loops;
//    write a program to find the multiplication of 2 numbers without *using operator

public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        int num1=7 , num2=7;
        int mult=0;
        while(num2>0){
            mult += num1;
            num2--;
        }
        System.out.println("Multiplication is "+mult);
    }
}
