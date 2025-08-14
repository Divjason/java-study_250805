package array;

public class Array3 {
    public static void main(String[] args) {
       int[] students; // 배열 선언
       students = new int[]{90, 80, 70, 60, 50}; // 배열 생성 & 초기화

        for (int i = 0; i < students.length; i++) {
            System.out.printf("학생%d의 점수 : %d%n", i + 1, students[i]);
        }
    }
}
