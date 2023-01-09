package Operator;
//Assign values of variables 'a' and 'b' as 55 and 70 respectively
// and then check if atleast one of the conditions 'a < 50' or 'a < b' is true.

public class CheckGreaterOrLess {
    public static void main(String[] args) {
        int a=55, b=70;
        System.out.println((a<50) || (a<b));
    }
}
