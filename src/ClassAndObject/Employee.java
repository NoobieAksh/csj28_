package ClassAndObject;
/*
1. Write a program by creating an 'Employee' class having the following methods and print the final salary.
 1. '`setEmployeeInformation`()' which takes the salary, number of hours of work per day of employee as parameter
 2. 'addSal()' which adds $10 to salary of the employee if it is less than $500.
 3. 'addWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
 */
public class Employee {
    String nameOfEmployee;
    int salary;
    int numberOfHours;

    void setEmployeeInfo(String name,int sal,int hr){
        nameOfEmployee = name;
        salary = sal;
        numberOfHours = hr;
    }
    void addSalary(){
        if(salary<500) {
            salary += 10;
        }
    }
    void addWork(){
        if(numberOfHours>6){
            salary += 5;
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmployeeInfo("Raj",400,8);
        emp1.addSalary();
        emp1.addWork();
        System.out.println("Salary: "+emp1.salary);
    }

}
