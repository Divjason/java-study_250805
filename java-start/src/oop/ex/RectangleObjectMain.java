package oop.ex;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2* (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}

public class RectangleObjectMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("가로 길이를 입력하세요 : ");
        rectangle.setWidth(scanner.nextInt());

        System.out.print("세로 길이를 입력하세요 : ");
        rectangle.setHeight(scanner.nextInt());

        int area = rectangle.calculateArea();
        System.out.printf("넓이 : %d%n", area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.printf("둘레 길이 : %d%n", perimeter);

        boolean square = rectangle.isSquare();
        System.out.printf("정사각형 여부 : %b%n", square);

        scanner.close();
    }
}
