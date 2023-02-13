package array;

public class Demo9ArrayCopy  {
    public static void main(String[] args) {
        int[] array1 = {1,0,3,5,6};
        //int[] array2 = array1;//just a reference copy
        int[] array2 = new int[array1.length];
        for(int index=0; index< array1.length; index++){
            array2[index] = array1[index];
        }
        System.out.println("Printing the copied index:");
        for(int index=0; index< array2.length; index++){
            System.out.print(array2[index]+" ");
        }
    }
}
