package oop.ex;

public class RectangleProceduralMain {
    // 1.절차지향 방식으로 다음과 같은 결과값이 출력될 수 있는 프로그래밍 코드를 작성
    // - width 변수 값을 5 입력 => 가로
    // - height 변수 값을 8 입력 => 세로
    // 상기 가로, 세로의 길이를 가지고 있는 사각형의 넓이, 둘레길이, 정사각형 여부의
    // 정보를 출력하는 프로그래밍 코드를 작성해보세요!!

    public static void main(String[] args) {
        int width = 8;
        int height = 8;

        int area = calculateArea(width, height);
        System.out.printf("넓이 : %d%n", area);

        int perimeter = calculatePerimeter(width, height);
        System.out.printf("둘레 길이 : %d%n", perimeter);

        boolean square = isSquare(width, height);
        System.out.printf("정사각형 여부 : %b%n", square);
    }

    static int calculateArea(int width, int height) {
        return  width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return  2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return  width == height;
    }
}
