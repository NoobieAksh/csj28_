package Loops;
//write a program to find the division of 2 numbers without using /,% operators
// and print quotient and the remainder
public class DivisionWithoutOperator {
    public static void main(String[] args) {

        int num=46, de=5;
        int temp=num;
        int counter=0;
        if(de==0){
            System.out.println("Infnity.");
        }
        while(temp>=de) {
            temp = temp - de;
            counter++;
        }
        System.out.println("Qiotient is:"+counter);
        System.out.println("Remainder is:"+temp);
    }
}
