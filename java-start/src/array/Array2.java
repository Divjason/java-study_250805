package array;

public class Array2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.printf("학생 1점수 : %d%n", students[0]);
        System.out.printf("학생 2점수 : %d%n", students[1]);
        System.out.printf("학생 3점수 : %d%n", students[2]);
        System.out.printf("학생 4점수 : %d%n", students[3]);
        System.out.printf("학생 5점수 : %d%n", students[4]);
    }
}
