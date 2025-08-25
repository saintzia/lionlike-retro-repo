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

        //equals(A,B) A와 B의 내용이 같은지 비교한다.
        //equals가 필요한 이유 : ==으로 비교할 시, 주소를 비교하게 되어 두 배열이 같은 주소를 가리키면 true 아니면 false를 반환하게 된다.
                            //이렇게 되면 우리가 원하는 값 비교를 할 수 없기 때문에 equal를 이용.
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        int[] arr3={2,3,4};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));


        //fill(배열, 숫자) - 배열을 숫자로 채운다.
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println(Arrays.toString(filled));

    }
}
