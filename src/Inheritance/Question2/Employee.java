package Inheritance.Question2;

public class Employee {
    public int hrs;
    public int rate;
    public int computeSalary(int hrs, int rate){
        this.hrs = hrs;
        this.rate = rate;
        return hrs*rate;
    }
}
