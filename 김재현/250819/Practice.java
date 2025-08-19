import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // 1. int 타입의 a라는 변수에 10을, b라는 변수에는 20이라는 값을 넣기.
        int a = 10;
        int b = 20;

        // 2. a와 b를 더해서 그 값을 출력하기.
        System.out.println(a + b);

        // 3. String 타입의 str 라는 변수에는 "Hello", str2라는 변수에 "World!"를 넣어 두 단어를 한줄에 출력하기.
        //    단, Hello 와 World 사이에 띄어쓰기가 있어야 한다.
        String str = "Hello";
        String str2 = "World!";
        System.out.println(str + " " + str2);

        // 4. printf 를 사용하여 "안녕하세요. 저는 OOO 이고, 생일은 OO월 OO일 입니다."를 출력하기.
        //    단, "입니다."가 끝난후 끝에 줄바꿈 서식지정자를 포함하여야 한다.
        System.out.printf("안녕하세요. 저는 %s이고, 생일은 %s월 %s일 입니다.\n", "김재현", "03", "07");

        // 5. if-else 문을 이용하여, a라는 변수가 5이상일 때, "5보다 크다."라고 출력하고, 그 외는 "5보다 작다." 라고 출력하기.
        if (a > 5) {
            System.out.println("5보다 크다");
        } else {
            System.out.println("5보다 작다");
        }

        // 6. 교안 Java-06 조건문 > 2.switch 문 > 2-2. switch 문의 예제를 타이핑하여 코드 따라쳐보기.
        switch (a) {
            case 1:
                System.out.println(12345);
                break;
            case 10:
                System.out.println("a = " + a);
                break;
            default:
                break;
        }

        int month = 7;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "잘못된 월";
                break;
        }
        System.out.println(month + "월은 " + season + "입니다.");

        // 7. 삼항연산자를 이용하여 a보다 b가 크면 true, 크지 않으면 false 를 출력하기
        System.out.println(a > b ? "true" : "false");

        // 8. Scanner 를 이용하여 두 수를 입력받아 총 합을 구하는 프로그램을 작성해보기.
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x + y;
        System.out.println("sum = " + sum);
    }
}
