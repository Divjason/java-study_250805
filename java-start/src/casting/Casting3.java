package casting;

public class Casting3 {
    public static void main(String[] args) {
        // 형 변환의 종류
        // 자동 형변환 : 상대적으로 작은 메모리를 사용할 수 있는 값이 큰 메모리를 사용할 수 있는 자료형으로 변경 (자동)
        // 명시적 형변환 : 반대의 경우, 인위적으로 자료형의 직접 입력해줘야 한다 (수동)

        long maxIntValue = 2147483647; // 양의 정수 최고값
        long maxIntOver = 2147483648L; // 양의 정수 최고값
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.printf("maxIntValue casting = %d%n", intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);
    }
}
