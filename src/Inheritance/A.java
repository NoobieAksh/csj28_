package Inheritance;

public class A {
    static {
        System.out.println("Static block of A");
    }
    {
        System.out.println("Instance block of A");
    }
    public A(){
        //IB
        System.out.println("A constructor");
    }
}
