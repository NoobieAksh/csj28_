package IfElse;
//Wap to print absolute value of a number entered by a user.
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        if(number>0){
            System.out.println(number);
        }else{
            System.out.println(-(number));
        }
    }
}
