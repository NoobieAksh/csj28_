package array;

public class Demo2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(array);
        System.out.println("First element of an array"+array[0]);
        System.out.println("How many elements are there in given array"+array.length);
        for(int index=0; index< array.length;index++){
            System.out.println(index+":"+array[index]);
        }
    }
}
