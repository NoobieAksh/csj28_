package Loops.Pattern;
/*
    20 40 60 80 100 120 140 160 180 200
    21 42 63 84 105 126 147 168 189 210
    22 44 66 88 110 132 154 176 198 220
    23 46 69 92 115 138 161 184 207 230
    24 48 72 96 120 144 168 192 216 240
    25 50 75 100 125 150 175 200 225 250
*
 */
public class Pattern12 {
    public static void main(String[] args) {
        for(int n=20; n<=25; n++) {
            for (int col=1; col<=10; col++) {
                System.out.print(n*col+" ");
            }
            System.out.println();
        }
    }
}
