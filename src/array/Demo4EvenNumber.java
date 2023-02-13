package array;

public class Demo4EvenNumber {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,8,11};
        for(int index=0; index< array.length; index++){
            if(array[index]%2 == 0){
                System.out.println(array[index]);
            }
        }
    }
}
