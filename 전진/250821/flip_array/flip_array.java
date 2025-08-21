package flip_array;

import java.util.Arrays;

public class flip_array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};

        int[] flip=new int[array.length];
        for(int i=0;i<array.length;i++){
            flip[i]=array[array.length-i-1];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(flip));
    }
}
