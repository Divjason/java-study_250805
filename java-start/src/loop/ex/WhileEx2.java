package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        // while문을 사용해서 1부터 숫자가 시작된다는 전제하에 처음 10개의 짝수를 출력!!
        // 2 ~ 20 : 짝수만 출력

        int num = 2;
        int count = 1;

        while(count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
