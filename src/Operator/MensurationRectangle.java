package Operator;
//- Length and breadth of a rectangle are 5 and 7 respectively.
//- Write a program to calculate the area and perimeter of the rectangle.

public class MensurationRectangle {
    public static void main(String[] args) {
        int lengthOfRectangle = 5;
        int breadthOfRectangle = 7;
        int areaOfRectangle = lengthOfRectangle * breadthOfRectangle;
        int perimeterOfRectangle = 2*(lengthOfRectangle + breadthOfRectangle);
        System.out.println("Area of Rectangle: "+areaOfRectangle);
        System.out.println("Perimeter of Rectangle: "+perimeterOfRectangle);
    }
}
