package Loops;
//Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.

public class AsciiValueAndCharacter {
    public static void main(String[] args) {
        for(int i=0; i<=255; i++) {
            System.out.println((char)i+":"+i);
        }
    }
}
