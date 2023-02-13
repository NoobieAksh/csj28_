package array;

public class Demo12MaxArray {
    public static void main(String[] args) {
        int[] array = {23,4,5,67,98,3};
        int max = array[0];
        for(int index=0; index< array.length; index++){
            if(array[index] > max){
                max=array[index];
            }
        }
        System.out.println("Max is : "+max);
    }
}
