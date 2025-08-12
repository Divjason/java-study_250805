package loop.ex;
import java.util.Scanner;

public class FinalEx1 {
    public static void main(String[] args) {
        /* ATM 기기를 코드로 작성
        초기 잔액 1만원
        사용자에게 콘솔창을 통해 메뉴선택 (1:입금, 2:출금, 3:잔액조회, 0:종료)
        만약 입금, 출금 => 얼마의 금액 입금 혹은 출금 값을 받아서 연산 -> 기존 잔액 변경
        만약 출금 시 잔액 부족 -> 잔액 부족! 메세지가 나올 수 있도록!!!
        메뉴선택지에 존재하지 않는 메뉴번호를 입력하는 경우, 잘못된 선택! 이라는 메세지 출력!!

        Java 표준 입.출력 스트림 => Scanner 필요
        if 조건문
        while 반복문
        break 종결
         */

        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        while (true) {
            System.out.println("\n==== ATM 메뉴 ====");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액조회");
            System.out.println("0. 종료");
            System.out.print("선택 : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("입금액 : ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.printf("%d원 입금완료\n", deposit);
            } else if (menu == 2) {
                System.out.print("출금액 : ");
                int withdraw = sc.nextInt();
                if(withdraw <= balance) {
                    balance -= withdraw;
                    System.out.printf("%d원 출금완료\n", withdraw);
                } else {
                    System.out.println("잔액부족!");
                }
            } else if (menu == 3) {
                System.out.printf("현재잔액 : %d원\n", balance);
            } else if (menu == 0) {
                System.out.println("이용해주셔서 감사합니다!😊");
                break;
            } else {
                System.out.println("잘못된 선택입니다!😒");
            }
        }
    }
}
