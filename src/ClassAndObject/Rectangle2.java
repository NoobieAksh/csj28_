package ClassAndObject;

import java.util.Scanner;

public class Rectangle2 {
    int length;
    int breadth;

    public Rectangle2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        System.out.println("Enter length and breadth: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle2 rect1 = new Rectangle2(length,breadth);
        System.out.println("rea of rectangle having sides 4 and 5: " + rect1.returnArea());
    }

}
