package ClassAndObject;
/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.*/
public class Triangle2 {
    int side1;
    int side2;
    int side3;
    public Triangle2(int s1, int s2, int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public float calculateArea(){
        return (float)0.5*side1*side2;
    }
    public int calculatePerimeter(){
        return side1+side2+side3;
    }

    public static void main(String[] args) {
        Triangle2 triangle = new Triangle2(3,4,5);
        System.out.println("Area of Triangle: "+triangle.calculateArea());
        System.out.println("Perimeter of Triangle: "+triangle.calculatePerimeter());
    }
}
