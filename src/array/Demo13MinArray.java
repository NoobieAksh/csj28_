package array;

public class Demo13MinArray {
    public static void main(String[] args) {
        int[] array = {23,5,6,89,1,-5};
        int min = array[0];
        for(int index=0; index< array.length; index++){
            if(array[index]<min){
                min = array[index];
            }
        }
        System.out.println("Min is : "+min);
    }
}
