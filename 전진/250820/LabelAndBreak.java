package LabelAndBreak;

public class LabelAndBreak {
    public static void main(String[] args) {
        //구구단을 출력하되, 4단을 생략하고, 7~9단은 5까지만 출력하기
        outterC:
        for (int y=1;y<=9;y++)
        {
            System.out.println("==============");
            outterB:
            for(int x=1;x<=9;x++)
            {
                if(y==4)
                    break outterB;
                if(y>=7&&x>5)
                    continue outterC;
                System.out.printf("%d * %d = %d",y,x,x*y);
                System.out.println();
            }

        }
    }
}
