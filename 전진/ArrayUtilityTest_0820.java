package Array_0820;

import java.util.Arrays;

public class ArrayUtilityTest_0820 {
    public static void main(String[] args) {
        int[] origin={1,2,3,4,5};
        //toString() - 배열을 문자열로 바꿔서 출력
        System.out.println(Arrays.toString(origin));

        //sort(배열이름) - 배열을 정렬함.
        int[] sorted=Arrays.copyOf(origin,origin.length);
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));

        //binarySearch(배열,탐색값) - 배열에서 탐색값의 인덱스를 찾는다.
        int index = Arrays.binarySearch(origin,3);
        System.out.println(Arrays.toString(origin));
        System.out.println(index);
    }
}
