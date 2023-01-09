package IfElse;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class AgeOfPerson {
    public static void main(String[] args) {
        System.out.println("Enter age of three persons:");
        Scanner scanner = new Scanner(System.in);
        int person1 = scanner.nextInt();
        int person2 = scanner.nextInt();
        int person3 = scanner.nextInt();
        if (person1 > person2 && person1 > person3) {
            System.out.println("Person1 is Oldest.");
            if (person2 > person3){
                System.out.println("Person3 is Youngest.");
            } else {
                System.out.println("Person2 is Youngest.");
            }
        }else if(person2 > person1 && person2 > person3){
            System.out.println("Person2 is oldest.");
            if (person1 > person3){
                System.out.println("Person3 is Youngest.");
            } else {
                System.out.println("Person1 is Youngest.");
            }
        }else if(person3 > person1 && person3 > person2){
            System.out.println("Person2 is oldest.");
            if (person2 > person1){
                System.out.println("Person1 is Youngest.");
            } else {
                System.out.println("Person2 is Youngest.");
            }
        }
    }
}
