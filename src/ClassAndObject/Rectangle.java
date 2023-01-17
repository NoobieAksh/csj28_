package ClassAndObject;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int area(){
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,5);
        Rectangle rect2 = new Rectangle(5,8);
        System.out.println("Area of rectangle having sides 4 and 5: "+rect1.area());
        System.out.println("Area of rectangle having sides 5 and 8: "+rect2.area());
    }
}
