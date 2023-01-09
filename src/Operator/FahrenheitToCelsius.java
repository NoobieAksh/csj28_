package Operator;
//Write a program to convert Fahrenheit into Celsius.

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float fahrenheit = 65;
        float celsius = ((fahrenheit - 32) * 5) / 9f;
        System.out.println("Temperature in Celsius is: " + celsius);
    }
}
