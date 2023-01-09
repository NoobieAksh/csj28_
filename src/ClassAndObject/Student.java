package ClassAndObject;
/*1. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
respectively by creating two objects of class 'Student'.
 */
public class Student {
    String name;
    int rollNo;
    String address;
    long mobNo;

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "John";
        std1.rollNo = 2;
        std1.address = "New York";
        std1.mobNo = 454225400;

        Student std2 = new Student();
        std2.name = "Sam";
        std2.rollNo = 4;
        std2.address = "Dubai";
        std2.mobNo = 952142423;

        System.out.println("Student Details:");
        System.out.println(std1.name+"\t"+std1.rollNo+"\t"+std1.address+"\t"+std1.mobNo);
        System.out.println(std2.name+"\t"+std2.rollNo+"\t"+std2.address+"\t"+std2.mobNo);

    }
}
