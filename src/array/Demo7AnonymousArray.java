package array;

public class Demo7AnonymousArray {
    public static void main(String[] args) {
        add(new int[]{10,20});
    }
    private static void add(int[] integer){
        System.out.println("Size of an array"+integer.length);
        for(int index=0; index< integer.length; index++){
            System.out.println(integer[index]);
        }
    }
}
