package Inheritance;

public class C extends B{
    static {
        System.out.println("static block C");
    }
    {
        System.out.println("instance block C");
    }
    public C() {
        // super();// call to the parent class constructor
        //IB
        System.out.println("C class con");
    }
}
