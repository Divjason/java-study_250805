package casting.ex;
import java.util.Scanner;

public class CastingEx1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("소수를 입력하세요. (예. 3.14159) : ");
       double input = scanner.nextDouble(); // 8bytes

        int castedToInt = (int) input; // 4bytes
        float convertedToFloat = castedToInt; // 4bytes

        System.out.printf("입력한 double 값 : %f%n", input);
        System.out.printf("int로 명시적 형변환 값 : %d%n", castedToInt);
        System.out.printf("int -> float 자동 형변환 값 : %f%n", convertedToFloat);
    }
}
