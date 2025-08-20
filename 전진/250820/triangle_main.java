package triangle;

public class triangle_main {
    public static void main(String[] args) {
        basic();
        reverse_basic();
        regular_triangle();
    }
    public static void basic(){
        System.out.println("삼각형 기본형");
        for(int y=1;y<=5;y++){
            for(int x=0;x<y;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void reverse_basic(){
        System.out.println("역삼각형 기본형");
        for(int y=0;y<5;y++){
            for(int x=y;x<5;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void regular_triangle(){
        System.out.println("정삼각형 기본형");
        for(int y=5;y>0;y--){
            for(int x=0;x<y;x++){
                System.out.print(" ");
            }
            for(int x=y;x<6;x++){
                System.out.print("*");
            }
            for(int x=y+1;x<6;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
