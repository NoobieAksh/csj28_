package IfElse;
/*
* A student will not be allowed to sit in exam if his/her attendance is less than 75%
* Take following input from user; Number of classes held; Number of classes attended.
* And Print: percentage of class attended
* Is Student is allowed to sit in exam or not.
 */
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of classes held :");
        int numberOfClaseesHeld = scanner.nextInt();
        System.out.println("Enter number of classes you attended: ");
        int numberOfClassesAttended = scanner.nextInt();
        float percentageOfClassAttended = (float)(numberOfClassesAttended*100)/numberOfClaseesHeld ;
        System.out.println("Percentage of classes attended:"+percentageOfClassAttended+"%");
        if (percentageOfClassAttended>=75){
            System.out.println("Student is allowed to sit in exam");
        } else {
            System.out.println("If you have medical cause or not('y' or 'n'):");
            char isMedicalCause = scanner.next().charAt(0);
            if(isMedicalCause=='Y' || isMedicalCause=='y'){
                System.out.println("Student is allowed to sit in exam");
            }else if(isMedicalCause=='N' || isMedicalCause=='n'){
                System.out.println("Student is not allowed to sit in exam");
            }else {
                System.out.println("Invalid Input.");
            }

        }
    }
}
