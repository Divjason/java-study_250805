package loop.ex; // 현재 작업중인 패키지 명
import java.nio.file.StandardOpenOption;
import java.util.Scanner; // 사용자로부터 값을 받아올 수 있도록 해주는 표준입력 클래스
import java.io.BufferedWriter; // 특정 파일을 생성후 관리하는 변수의 타입 생성 클래스
import java.io.IOException; // 예외처리를 위해서 필요한 클래스
import java.nio.charset.StandardCharsets; // 한글, 특수문자 등을 정상적으로 출력
import java.nio.file.Path; // 특정 파일을 생성할 때 경로 설정
import java.nio.file.Files; // 특정 파일을 생성후 관리할 수 있도록 해주는 클래스

public class    FinalEx3 {
    public static void main(String[] args) {
        /*
        놀이공원 -> 입장료!!!
        어린이 -> 무료!!!
        18세 이하 (청소년) -> 1000원 요금!!!
        19세 이상 (성인) -> 2000원 요금!!!

        > 사용자에게 나이를 입력받아야함! : Scanner
        > if조건문 연산처리!!!
        > 프로그램을 종료할 수 있는 장치!!!
        > 사용자가 입력한 값을 엑셀파일 저장해서, 그동안 어떤 사용자들이 방문했는지 기록
        */
        Path path = Path.of("fee_log.csv");

        try(Scanner scanner = new Scanner(System.in);
            BufferedWriter writer = Files.newBufferedWriter(
                    path,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            )) {

            writer.write('\uFEFF');
            writer.write("입력순서, 나이, 요금");
            writer.newLine();

            int totalFee = 0;
            int personCount = 0;
            
            System.out.println("입장요금 계산기");
            System.out.println("나이를 입력하세요. 종료하려면 q를 입력하세요.");

            while(true) {
                System.out.print("나이 입력 : ");
                String input = scanner.nextLine();

                if(input.equalsIgnoreCase("q")) {
                    System.out.println("프로그램을 종료합니다!");
                    break;
                }

                try {
                    int age = Integer.parseInt(input);
                    int fee;

                    if(age < 0) {
                        System.out.println("유효한 나이를 입력해주세요.");
                        continue;
                    } else if (age <= 7) {
                        fee = 0;
                        System.out.printf("어린이 요금 : %d원 (무료)%n", fee);
                    } else if (age <= 18) {
                        fee = 1000;
                        System.out.printf("청소년 요금 : %d원%n", fee);
                    } else {
                        fee = 2000;
                        System.out.printf("성인 요금 : %d원%n", fee);
                    }

                    totalFee += fee;
                    personCount++;

                    writer.write(String.format("%d, %d, %d", personCount, age, fee));
                    writer.newLine();
                    writer.flush();

                    System.out.printf(String.format("현재까지 총 요금 : %d원%n", totalFee));

                } catch(NumberFormatException e) {
                    System.out.println("숫자만 입력하거나 q로 종료할 수 있습니다.");
                }
            }

            System.out.printf(String.format("최종 총 요금 : %d원%n", totalFee));
            // 어떤 실행문이 정상적으로 실행된다면 try 작동
        } catch (IOException e) {
            System.out.println("CSV 파일 저장 중 오류 발생 : " + e.getMessage());
            // 어떤 실행문이 정상적으로 실행되지 않는다면 catch 작동
        }
    }
}
