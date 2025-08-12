package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        // 중첩 for문을 활용해서 피라미드 출력
        // rows = 5;
        // *
        // **
        // ***
        // ****
        // *****

        int rows = 10;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
