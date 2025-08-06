package operator.ex;

public class OperationEx2 {
    public static void main(String[] args) {
        // 변수를 하나 선언하세요.
        // 해당 변수 안에 입력된 값이 80이상이고, 100이하이면,
        // 콘솔창에 true가 출력되게 하시고, 아니면 false가 출력되게!!

        int score = 90;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}
