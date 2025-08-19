package method;

public class Method2 {
    public static void main(String[] args) {
        // return -> 함수 종료(7), 값을 반환(3)
        // return 종료 & 반환
        // 연산처리 => 값을 어딘가에 전달 => 더이상 할 것이 없다는 의미
        // 함수의 반환값 타입 => void => 반환값이 없다는 의미!!
        // 함수 호출 -> a와 b의 위치에 입력된 값들 -> 인자값, 인수
        int sum1 = add(5, 10);
        System.out.printf("결과1 출력 : %d%n", sum1);

        int sum2 = add(15, 20);
        System.out.printf("결과2 출력 : %d%n", sum2);
    }

    // add 함수 선언!!! -> a, b 매개변수
    public static int add(int a, int b) {
        System.out.printf("%d + %d 연산수행%n", a, b);
        int sum = a + b;
        return sum; // return문 -> 함수 호출 시 반환값을 정의
    }
}
