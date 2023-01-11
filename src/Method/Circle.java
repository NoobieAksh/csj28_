package Method;

import java.util.Scanner;

public class Circle {
    static void circumferenceAndArea(float radius){
        System.out.println("Circuference: "+(2*3.142f*radius));
        System.out.println("Area: "+(3.142f*radius*radius));
    }

    public static void main(String[] args) {
        System.out.println("Enter radius of a circle: ");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        circumferenceAndArea(radius);
    }
}
