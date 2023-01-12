package Method;
/*Define a method named 'perfect' that determines if parameter number is a perfect number.
Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
 */
public class PerfectNumber {
    public static void perfect(){
        for(int number=1; number<=10000; number++) {
            int sum = 0;

            for(int i=1; i<=number/2; i++){
                if(number%i == 0){
                    sum += i;
                }
            }
            if(sum==number){
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        PerfectNumber.perfect();
    }
}
