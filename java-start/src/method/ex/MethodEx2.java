package method.ex;

import java.util.Scanner;

public class MethodEx2 {
    // 아래 작성한 코드를 함수를 통해서 리펙토링 하세요!!!
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while(true) {
            System.out.println("------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("------------------------------------");
            System.out.print("선택 : ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.printf("현재잔액 : %d원", balance);
                    break;
                case 4:
                    System.out.println("시스템종료");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.printf("%d원을 입금하였습니다. 현재 잔액 : %d%n", amount, balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.printf("%d원을 출금하였습니다. 현재 잔액 : %d%n", amount, balance);
        } else {
            System.out.printf("%d원을 출금하려고 했으나 잔액이 부족합니다. 현재 잔액 : %d%n", amount, balance);
        }
        return balance;
    }
}
