package method;

public class Method1 {
    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b = 2;

        System.out.printf("%d + %d 연산수행%n", a, b);
        int sum1 = a + b;
        System.out.printf("결과출력 : %d%n", sum1);

        // 계산 2
        int x = 10;
        int y = 20;

        System.out.printf("%d + %d 연산수행%n", x, y);
        int sum2 = x + y;
        System.out.printf("결과출력 : %d%n", sum2);

        // 함수형태 = 모양
        // add() -> 무조건 함수!!! 영어단어 -> 함수명( )
        // 어떤 값이던지 2개의 값이 add()함수를 거치면 실제 더하기 연산의 결과값을 반환!!
        // add(a, b) 인자 혹은 인수 a + b => 결과값을 반환하자!!!
    }
}
