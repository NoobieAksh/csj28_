package Method;

public class DifferentSeqOfParameter {
    static void getValue(int number, char character){

        System.out.println("Number "+number+" Character "+character);
    }
    static void getValue(char character,int number){
        System.out.println("Character "+character+" Number "+number);
    }

    public static void main(String[] args) {
        DifferentSeqOfParameter.getValue('A',54);
        DifferentSeqOfParameter.getValue(54,'B');
    }
}
