package Inheritance;

public class Case1 {
    public static void main(String[] args) {
        //parent class object and parent class reference: we can access only from parent class
        Parent1 parent = new Parent1();
        System.out.println(parent.a);//10
        System.out.println(parent.b);//20
        System.out.println(parent.c);//30
        System.out.println(parent.d);//40
    }
}
