package Operator;
//Assign values of variables 'a' and 'b' as 55 and 70 respectively and
// then check if both the conditions 'a < 50' and 'a < b' are true.

public class CheckGreaterAndLess {
    public static void main(String[] args) {
        int a = 55, b = 70;
        System.out.println((a < 50) && (a < b));
    }
}
