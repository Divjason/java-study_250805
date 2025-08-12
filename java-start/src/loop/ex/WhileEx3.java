package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        // for문을 활용한 누적 합 계산!!!
        // max => 1 : 1
        // max => 2 : 1 + 2 => 3
        // max => 3 : 1 + 2 + 3 => 6
        // max => 100 : 1 + 2 + 3 + ..... + 100 => 5050

        int max = 3;
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
