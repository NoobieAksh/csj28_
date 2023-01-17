package Method;
//Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different
// methods with the same name 'printn' having a parameter for each datatype.

public class PrintNumber {
    void printN(byte n) { System.out.println(n); }
    void printN(short n) { System.out.println(n); }
    void printN(int n) { System.out.println(n); }
    void printN(long n) { System.out.println(n); }
    void printN(float n){
        System.out.println(n);
    }
    void printN(double n){
        System.out.println(n);
    }
    void printN(char n){
        System.out.println(n);
    }
    void printN(boolean n){
        System.out.println(n);
    }

    public static void main(String[] args) {
        PrintNumber ref = new PrintNumber();
        ref.printN(4.5f);

    }
}
