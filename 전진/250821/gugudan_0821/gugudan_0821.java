package gugudan_0821;

public class gugudan_0821 {
    public static void main(String[] args) {
        int[][] gugudan=new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                gugudan[i][j]=(i+1)*(j+1);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%d * %d = %d \n",i+1,j+1,gugudan[i][j]);
            }
        }
    }
}
