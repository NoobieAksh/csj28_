package KnowDataTypes;
//Write a program to assign a value of 100.235 to a double variable and then convert it to int.

public class DoubleToInt {
    public static void main(String[] args) {
        double number = 100.235d;
        int doubleToInt = (int)number;
        System.out.println("Integer value is: "+doubleToInt);
    }
}
