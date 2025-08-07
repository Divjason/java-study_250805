package cond.ex;
import java.util.Scanner;

// 라이브러리 -> 도서관 -> 지식 및 자료, 정보를 빌려보기 위한 목적
// 프로그래밍 영역 -> 이미 누군가가 어떤 기능을 생성 -> 빌려서 사용하기 위한
// 자바 언어 -> 표준 라이브러리 (*JDK)
// 클래스 객체 -> 클래스 객체 -> 프로토타입 객체 -> 인스턴스 객체 역할

public class NumEx {
    public static void main(String[] args) {
        // 숫자 맞추기 게임!!
        // 콘솔창을 활용해서 사용자에게 어떤 값을 받을 예정
        // 우리가 사전에 초기화한 변수안에 입력된 숫자와 같으면 "정답입니다"
        // 만약 사전에 초기화한 변수안에 입력된 숫자와 같지 않으면 "다시 시도하세요!"

        int secretNumber = 7;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 (1~10) : ");
        int userGuess = scanner.nextInt();

        if(secretNumber == userGuess)
            System.out.println("정답입니다! 👍");
        else
            System.out.println("틀렸습니다! 😆다시 시도해주세요");

        scanner.close();
//        System.out.println(); // <- 콘솔창에 값을 출력!! 표준 출력 스트림
//        System.in; // <- 표준 입력 스트림 (Stream => 개울, 흘러가는 현상)
    }
}
