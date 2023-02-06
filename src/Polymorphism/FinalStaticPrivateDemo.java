package Polymorphism;

public class FinalStaticPrivateDemo {
    final void m1(){
        System.out.println("m1 without parameter ");
    }
    final void m1(int num){
        System.out.println("m1 with parameter "+num);
    }
    static void m2(){
        System.out.println("m2 without parameter ");
    }
    static void m2(String str){
        System.out.println("m2 with parameter "+str);
    }
    private void m3(){
        System.out.println("m3 without parameter ");
    }
    private void m3(String str){
        System.out.println("m3 without parameter "+str);
    }

    public static void main(String[] args) {
        FinalStaticPrivateDemo ref = new FinalStaticPrivateDemo();
        ref.m1();
        ref.m1(5);
        m2();
        m2("str");
        ref.m3();
        ref.m3("str");
    }
}
