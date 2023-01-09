package Loops;
//Write all Armstrong numbers between 100 to 500.

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Arstrong number between 100 to 500: ");
        for(int i=100; i<=500; i++){
            int sumOfCubeOFDigit = 0;
            int number = i;
            while(number>0){
                int lastDigit = number%10;
                sumOfCubeOFDigit += (lastDigit*lastDigit*lastDigit);
                number /= 10;
            }
            if(sumOfCubeOFDigit==i){
                System.out.print(sumOfCubeOFDigit+" ");
            }
        }
    }
}
