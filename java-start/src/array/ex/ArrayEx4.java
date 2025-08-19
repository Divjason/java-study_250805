package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 1.사용자에게 입력받을 숫자의 갯수를 먼저 받아주세요 : ex. 3
        // 2.사용자가 입력한 숫자에 맞춰서 질문을 출력해주세요! : ex. 3개의 정수를 입력하세요.
        // 1
        // 2
        // 3
        // 3. 입력한 정수의 합계 : ex.6
        // 4. 입력한 정수의 평균 : ex.2.0

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 :");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.printf("%d개의 정수를 입력하세요.%n", count);
        for(int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;

        System.out.printf("입력한 정수의 합계 : %d%n", sum);
        System.out.printf("입력한 정수의 평균 : %f", average);
    }
}
