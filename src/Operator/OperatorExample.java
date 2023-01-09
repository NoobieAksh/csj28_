package Operator;
/*The total number of students in a class are 90 out of which 45 are boys.
If 50% of the total students secured grade 'A' out of which 20 are boys,
then write a program to calculate the total number of girls getting grade 'A'.*/

public class OperatorExample {
    public static void main(String[] args) {
        int totalStudents = 90;
        int boys = 45;
        int studentsScoredA = 90/2;
        int studentsScoredA_Boys = 20;
        int studentsScoredA_Girls = studentsScoredA - studentsScoredA_Boys;
        System.out.println("total number of girls getting grade 'A': "+studentsScoredA_Girls);
    }
}
