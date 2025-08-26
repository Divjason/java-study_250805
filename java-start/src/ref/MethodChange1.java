package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        // 메서드 = method => 클래스를 선언할 때, 생성되는 함수를 표현 방법
        System.out.printf("메서드 호출 전 : a = %d%n", a);
        changePrimitive(a);
        System.out.printf("메서드 호출 후 : a = %d%n", a);
        
        // int x = a = 10;
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
