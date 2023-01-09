package ClassAndObject;


import java.util.Scanner;

/*
1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
2. First method named as 'setDim' takes length and breadth of rectangle as parameters and
 the second method named as 'getArea' returns the area of the rectangle.
3. Length and breadth of rectangle are entered through keyboard.
 */
public class Area {
    int length;
    int breadth;
    public void setDim(int l,int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        int result = length*breadth;
        return result;
    }
    public static void main(String[] args){
        System.out.println("Enter length and breadth of rectangle:");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        Area x =new Area();
        x.setDim(l,b);
        System.out.println("Area Of Ractangle: "+x.getArea());
    }
}

