package Method;
/*
Create a class to print the area of a square and a rectangle.
The class has two methods with the same name but different number of parameters.
The method for printing area of rectangle has two parameters which are length and breadth respectively while the
other method for printing area of square has one parameter which is side of square.
 */
public class SquareAndRectangle {
    public static void main(String[] args) {
        int side = 4;
        int length = 5;
        int breadth = 8;
        System.out.println("Area of square: "+SquareAndRectangle.area(side));
        System.out.println("Area of rectangle: "+SquareAndRectangle.area(length,breadth));
    }
    static int area(int side){
        return side*side;
    }
    static int area(int length,int breadth){
        return length*breadth;
    }
}
