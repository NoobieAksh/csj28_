package Polymorphism;
//Method Overloading

public class Addition {
    public static int add(int n1, int n2){
        return n1+n2;
    }
    //public void add(int n1, int n2){    }
    //CTE: as method return type is not considered for method overloading.
    public static int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public static String add(String str1,String str2){
        return str1+str2;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add("abc","xyz"));

    }

}
