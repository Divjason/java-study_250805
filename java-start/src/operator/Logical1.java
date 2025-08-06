package operator;

public class Logical1 {
    public static void main(String[] args) {
        // && => And 연산자
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        // || => Or 연산자
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        // ! => Not 연산자
        System.out.println(!true);
        System.out.println(!false);

        int a = 15;
        boolean result = a > 10 && a < 20;
        System.out.println(result);
    }
}
