package Array_0820;

import java.util.Arrays;

public class ArrayCopyTest_0820 {

    public static void main(String[] args) {
        int[] origin={1,2,3,4,5};
        //copy1 =을 이용한 배열 전체 복사
        int[] copy1=origin;

        //copy2 반복문을 이용해 속성을 하나씩 복사
        int[] copy2=new int[origin.length];
        for(int i=0;i<origin.length;i++){
            copy2[i]=origin[i];
        }

        //copy3 arraycopy를 이용한 복사
        int[] copy3=new int[origin.length];
        System.arraycopy(origin,0,copy3,0,origin.length);

        //copy4 copyof를 이용한 복사
        int[] copy4=new int[origin.length];
        copy4= Arrays.copyOf(origin,origin.length);

        //전부 출력한 후, 원본의 내용을 수정하여 복사한 배열도 수정되는지 확인
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


        //=을 사용한 복사는 전부 얕은 복사되었음
    }
}
