package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 아래 코드를 배열 자료형 & 반복문을 활용해서 코드를 리팩토링 해주세요!!!

//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;
//
//        int total = student1 + student2 + student3 + student4 + student5;
//        double average = (double) total / 5;
//
//        System.out.printf("점수 총합 : %d%n", total);
//        System.out.printf("점수 평균 : %f%n", average);

        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for(int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double average = (double) total / students.length;

        System.out.printf("점수 총합 : %d%n", total);
        System.out.printf("점수 평균 : %f%n", average);
    }
}
