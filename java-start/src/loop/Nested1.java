package loop;

public class Nested1 {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i++) {
            System.out.printf("외부 for문 시작 i : %d %n", i);
            for (int j = 0; j < 3; j++) {
                System.out.printf("내부 for문 시작 %d - %d %n", i, j);
            }
            System.out.printf("외부 for문 종료 i : %d %n", i);
            System.out.println();
        }
    }
}
