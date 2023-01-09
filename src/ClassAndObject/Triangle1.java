package ClassAndObject;
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
 a class named 'Triangle' without any parameter in its constructor.*/
public class Triangle1 {
    int side1,side2,side3;

    int area(){
        return (side1*side2)/2;
    }
    int perimeter(){
        return side1+side2+side3;
    }

    public static void main(String[] args) {
        Triangle1 ref = new Triangle1();
        ref.side1 = 3;
        ref.side2 = 4;
        ref.side3 = 5;
        System.out.println("Area of triangle: "+ref.area());
        System.out.println("Perimeter of triangle: "+ref.perimeter());
    }
}
