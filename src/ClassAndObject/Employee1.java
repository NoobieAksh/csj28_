package ClassAndObject;
/*
1. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'.
2. The output should be as follows:
Name Year_of_joining Address
Robert 1994 64C- WallsStreet
Sam 2000 68D- WallsStreet
John 1999 26B- WallsStreet
 */
public class Employee1 {
    String nameOfEmployee;
    int yearOfJoining;
    int salary;
    String address;
    void setEmployee(String name,int yoj,int sal,String add){
        nameOfEmployee = name;
        salary = sal;
        yearOfJoining = yoj;
        address = add;
    }
    void getEmployee(){
        System.out.println(nameOfEmployee+"\t"+yearOfJoining+"\t"+salary+"\t"+address);
    }

    public static void main(String[] args) {
        Employee1 emp1 = new Employee1();
        emp1.setEmployee("Robert", 1994, 64000,"C- WallsStreet");
        emp1.getEmployee();

        Employee1 emp2 = new Employee1();
        emp2.setEmployee("Sam", 2000, 250000,"C- WallsStreet");
        emp2.getEmployee();

        Employee1 emp3 = new Employee1();
        emp3.setEmployee("John", 1999, 64000,"C- WallsStreet");
        emp3.getEmployee();

    }
}
