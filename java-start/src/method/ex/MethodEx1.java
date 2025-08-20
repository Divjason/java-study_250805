package method.ex;

public class MethodEx1 {
    // 아래 작성한 코드를 함수를 통해서 리펙토링 하세요!!!
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//        double average = sum / 3.0;
//
//        System.out.printf("평균값 : %f%n", average);
//
//        int x = 15;
//        int y = 25;
//        int z = 35;
//
//        sum = a + b + c;
//        average = sum / 3.0;
//
//        System.out.printf("평균값 : %f%n", average);

        System.out.printf("평균값 : %f%n", average(1, 2, 3));
        System.out.printf("평균값 : %f%n", average(15, 25, 35));
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return  sum / 3.0;
    }
}
