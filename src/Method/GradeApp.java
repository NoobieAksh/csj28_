package Method;

import java.util.Scanner;

/*
Write a program which will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         A
81-90          B
71-80          C
61-70          D
35-50          E
<35          Fail
 */
public class GradeApp {
    public static void main(String[] args) {
        System.out.println("Enter your marks(out of 100): ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        System.out.println(GradeApp.gradeCalculate(marks));
    }
    static String gradeCalculate(int marks) {
        String grade = "Fail";
        if (marks >= 91 && marks <= 100) {
            grade = "A";
        } else if (marks >= 81 && marks <= 90) {
            grade = "B";
        }
        if (marks >= 71 && marks <= 80) {
            grade = "C";
        }
        if (marks >= 61 && marks <= 70) {
            grade = "D";
        }
        if (marks >= 35 && marks <= 50) {
            grade = "E";
        } else {
            return grade;
        }
        return grade;
    }
}
