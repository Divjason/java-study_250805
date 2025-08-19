package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 1.사용자로부터 4학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는
        // 프로그램을 작성해주세요. 반드시 2차원 배열을 사용해주세요!!!
        // 2.[행][열] => 2행 3열 => 1행 3번 // 2행 3번

        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];

        String[] subjects = {"국어", "영어", "수학"};

        for(int i = 0; i < 4; i++) {
            System.out.printf("%d번 학생의 성적을 입력하세요.%n", i + 1);
            for(int j = 0; j < 3; j++) {
                System.out.printf("%s 점수 :", subjects[j]);
                scores[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 4; i++) {
            int total = 0;
            for(int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.printf("%d번 학생의 총점 : %d, 평균 : %f%n", (i + 1), total, average);
        }
    }
}
