package variable;

public class Var8 {
    public static void main(String[] args) {
        // 입력하고자 하는 값의 형태가 정수인 경우, 입력자료형 3가지
        int i = 10; // 4byte 약 20억 메모리 사용 가능
        short s = 32767; // 2byte 메모리 사용 가능 = -32,768 ~ 32,767
        byte b = 127; // 1byte 메모리 사용 가능 bit 0, 1 => 8개 => 1byte
        // -128 ~ 127
        // 똑같은 정수형태의 값을 입력받을 수 있지만, 허용가능한 메모리상이
        long l = 32165; // 8byte

        // 실수형
        // 자바 -> 정수 int, double
        float f = 10.0f; // 4byte
        double d = 10.0; // 8byte
    }
}
