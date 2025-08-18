package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
       int[] numbers = {1, 2, 3, 4, 5};

       for (int i = 0; i < numbers.length; i++) {
           int number = numbers[i];
           System.out.println(number);
       }

       // 어차피 반복문을 활용할 수 있는 객체는 정해져 있음 => 이터러블한 객체
        // 배열, 문자열 => apple => 5개 문자 //
        // 굳이 배열, 문자열이던 애초에 선언 및 할당 단계부터 안에 입력될 값의 갯수가
        // 정해져있는데, 반복 횟수를 또 선언해줘야 할까?

        // 그러면 for-each문이 이렇게 효율적이라면, 왜 굳이 for
        // 문을 써야하는가? -> for-each문은 반복하고 있는 횟수의 index값을 반환하지 못하기
        // 때문에, 이때에는 for문을 사용한다!!!
       for(int number : numbers) {
           System.out.println(number);
       }
    }
}
