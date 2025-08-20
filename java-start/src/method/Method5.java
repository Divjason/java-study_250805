package method;

public class Method5 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if(age < 18) {
            System.out.printf("%d살, 미성년자는 출입이 불가능합니다.%n", age);
            return;
        }

        System.out.printf("%d살, 입장하세요.", age);
    }
}
