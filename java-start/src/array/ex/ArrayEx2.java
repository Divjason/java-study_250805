package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 사용자로부터 5개의 정수를 받으세요. -> Scanner
        // 출력을 아래와 같이 해주세요.
        // 1
        // 2
        // 3
        // 4
        // 5
        // 1, 2, 3, 4, 5 -> 이렇게 출력!!!!

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("출력");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if(i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
