package circit_array;

public class circit_array {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = array.length;        // 행 개수 (3)
        int cols = array[0].length;     // 열 개수 (3)

        // 총 원소 개수만큼 반복
        for (int i = 0; i < rows * cols; i++) {
            int row = i / cols;   // 현재 행
            int col = i % cols;   // 현재 열

            System.out.print(array[row][col] + " ");
        }
    }
}
