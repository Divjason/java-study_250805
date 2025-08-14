package casting;

public class Casting1 {
    public static void main(String[] args) {
        // int > long > double
        // 상대적으로 큰 범위의 메모리를 사용하는 곳으로 이동 문제 x
        // 반대로 작은 범위의 메모리를 사용하는 곳으로 이동 문제 o
        // 오버플로우 에러현상 (*소수점 버림, 오버플로우 에러메세지)
        // 0, 1 -> 0 -> 1 -> 10 -> 11 -> 100

        int intValue = 10; // 4 bytes
        long longValue; // 8bytes
        double doubleValue; // 8bytes

        longValue = intValue;
        System.out.printf("longValue = %d%n", longValue);

        doubleValue = intValue;
        System.out.println("doubleValue1 = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
