package array;

public class Demo3LinearSearch {
    public static void main(String[] args) {
        int[] array = {11,22,33,44,55};
        int element = 44;

        for(int index=0; index< array.length; index++) {
            if(element == array[index]){
                System.out.println(element+" is present at index "+index);
            }
        }
    }
}
