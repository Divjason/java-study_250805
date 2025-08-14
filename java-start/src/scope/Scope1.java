package scope;

public class Scope1 {
    public static void main(String[] args) {
        // 변수는 선언한 위치에 따라 지역변수, 전역변수
        // 지역변수 = local variable => 지역방송국
        // 해당 지역 내 블록 => 실행 종료 => 해당 변수 사용 종료
        // 전역변수 = global variable => 전국구방송국
        // JTV
        // 상대적으로 변수를 사용할 수 있는 범위가 넓어진다는 것은 그만큼 컴퓨터 내 메모리
        // 메모리 공간을 많이 차지하도록 하겠다!!

        int m = 10;
        if(true) {
            int x = 20;
            System.out.printf("if m = %d%n", m);
            System.out.printf("if x = %d%n", x);
        }
//        System.out.printf("main x = %d", x);
        System.out.printf("main m = %d", m);
    }
}
