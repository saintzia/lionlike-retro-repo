package Array_0820;

import java.util.Arrays;

public class ArrayCopyTest_0820 {

    public static void main(String[] args) {
        int[] origin={1,2,3,4,5};
        int[] copy1=origin;

        int[] copy2=new int[origin.length];
        for(int i=0;i<origin.length;i++){
            copy2[i]=origin[i];
        }
        int[] copy3=new int[origin.length];
        System.arraycopy(origin,0,copy3,0,origin.length);

        int[] copy4=new int[origin.length];
        copy4= Arrays.copyOf(origin,origin.length);

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));
        System.out.println(Arrays.toString(copy3));
        System.out.println(Arrays.toString(copy4));
        System.out.println("====================");
        origin[0]=100;
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));
        System.out.println(Arrays.toString(copy3));
        System.out.println(Arrays.toString(copy4));
    }
}
