package KnowDataTypes;
//Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.

public class AddToAsciiValue {
    public static void main(String[] args) {
        char ch = 'd';
        int valueOFCharacter = (3+ch);
        System.out.println("ASCII value after adding 3 in d is: "+ valueOFCharacter);
    }
}
