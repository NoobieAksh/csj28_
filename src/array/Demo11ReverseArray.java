package array;

public class Demo11ReverseArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int left = 0;
        int right = array1.length-1;

        while(left<=right){
            int temp = array1[left];
            array1[left] = array1[right];
            array1[right] = temp;
            left++;
            right--;
        }
        System.out.println("After reverse: ");
        for(int index=0; index< array1.length; index++){
            System.out.print(array1[index]+" ");
        }
    }
}
