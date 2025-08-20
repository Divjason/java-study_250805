package method;

public class Method6 {
    public static void main(String[] args) {
        int num1 = 5;

        System.out.printf("1. changeNumber 호출 전, num1 : %d%n", num1);
        changeNumber(num1);
        System.out.printf("4. changeNumber 호출 후, num1 : %d%n", num1);
    }

    public static void changeNumber(int num2) {
        System.out.printf("2. changeNumber 변경 전, num2 : %d%n", num2);
        num2 *= 2;
        System.out.printf("3. changeNumber 변경 후, num2 : %d%n", num2);
    }
}
