package Operator;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println("Before Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
