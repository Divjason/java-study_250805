package cond.ex;
import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🤷‍♂️홀수/짝수 판별기");
        System.out.println("숫자를 입력하세요. 종료하려면 q를 입력하세요.");

        while (true) {
            System.out.print("입력 : ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("프로그램을 종료합니다!");
                break;
            }

            try {
               int number = Integer.parseInt(input);

               if (number % 2 == 0) {
//                   System.out.println(number + "는 짝수입니다!");
//                   System.out.println(String.format("%d 는 짝수입니다!", number));
                   System.out.printf("%d는 짝수입니다!%n", number);
               } else {
//                   System.out.println(number + "는 홀수입니다!");
//                   System.out.println(String.format("%d 는 홀수입니다!", number));
                   System.out.printf("%d는 홀수입니다!%n", number);
               }

            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하거나 q를 입력하여 종료하세요");
            }
        }
        scanner.close();
    }
}
