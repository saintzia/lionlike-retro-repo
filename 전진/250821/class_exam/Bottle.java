package class_exam;

public class Bottle {
    public String Shape="cylinder";
    public int size=1000;//ml
    public String user="jin";
    private int current_Fluid=500;

    //생성자
    public Bottle(String bShape, int bSize, String bUser, int bCurrentFluid) {
        this.Shape = bShape;               // 전달받은 매개변수를 필드에 대입
        this.size = bSize;
        this.user = bUser;
        //this.current_Fluid = bCurrentFluid;
    }

    public Bottle() {

    }

    //물 채우기
    public void fill(int n){
        current_Fluid+=n;
    }

    //물의 양 확인하기
    public int getCurrentFluid(){
        return current_Fluid;
    }



    public static void main(String[] args){
        Bottle b=new Bottle();
        System.out.println(b.getCurrentFluid());
        b.fill(200);
        System.out.println(b.getCurrentFluid());

    }
}
/*
    텀블러
    모양 / 용량 / 사용자
    물 채우기/ 물 비우기/ 물의 양 확인하기/ 마시기

    책
    페이지 수/ 제목/


 */
