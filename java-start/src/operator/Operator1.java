package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 3(*피연산자 = operand) +(*연산자 = operator) 4
        int a = 5;
        int b = 2;

        int sum = a + b;
        String result01 = String.format("a + b = %d", a + b);
        System.out.println(result01);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);

        int mod2 = a + b;
        String result02 = String.format("a %% b = %d", mod2);
        System.out.println(result02);
    }
}
