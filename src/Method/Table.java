package Method;
//Print the multiplication table of 15.
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Table.multiplicationTable(number);
    }
    static void multiplicationTable(int number){
        for(int i=1; i<=10; i++){
            System.out.println(number+"*"+i+"= "+number * i);
        }
    }
}
