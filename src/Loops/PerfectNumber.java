package Loops;
//write a program to print perfect number in the range of 1-1000

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect number in range of 1 to 1000 are:");
        for(int num=1; num<=1000; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(sum);
            }
        }
    }
}
