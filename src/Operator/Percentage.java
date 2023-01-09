package Operator;
//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
//write a program to calculate his total marks and percentage marks.
public class Percentage {
    public static void main(String[] args) {
        int marksOfSubject1 = 78;
        int marksOfSubject2 = 45;
        int marksOfSubject3 = 62;
        int totalMarks = (marksOfSubject1 + marksOfSubject2 + marksOfSubject3);
        float percentage = (totalMarks*100)/300f;
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Percentage: "+percentage);
    }
}
