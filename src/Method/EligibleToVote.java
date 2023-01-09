package Method;

import java.util.Scanner;

/*
A person is elligible to vote if his/her age is greater than or equal to 18.
Define a method to find out if he/she is elligible to vote.
 */
public class EligibleToVote {
    int age;
    void isEligibleToVote(int age){
        if(age>=18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        EligibleToVote ref = new EligibleToVote();
        ref.age = sc.nextInt();
        ref.isEligibleToVote(ref.age);
    }
}
