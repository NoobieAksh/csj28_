package Inheritance;

public class Case3 {
    public static void main(String[] args) {
        Parent1 parent = new Child1();
        System.out.println(parent.a);//10  parent class
        System.out.println(parent.b);//20  parent class
        System.out.println(parent.c);//30  parent class
        System.out.println(parent.d);//40  parent class
        parent.m1();//child class method
    }
}
