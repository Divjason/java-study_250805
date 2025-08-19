package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 1.사용자에게 입력받을 숫자의 갯수를 먼저 받아주세요 : ex. 3
        // 2.사용자가 입력한 숫자에 맞춰서 질문을 출력해주세요! : ex. 3개의 정수를 입력하세요.
        // 1
        // 2
        // 3
        // 3. 입력한 정수 중에서 가장 작은 정수 : ex.1
        // 4. 입력한 정수 중에서 가장 큰 정수 : ex.3

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 :");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.printf("%d개의 정수를 입력하세요.%n", n);
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];

        for(int i = 1; i < n; i++) {
            if(numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if(numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.printf("가장 작은 정수 : %d%n", minNumber);
        System.out.printf("가장 큰 정수 : %d", maxNumber);
    }
}
