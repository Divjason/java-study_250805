package loop.ex;
import java.util.Scanner;

public class FinalEx2 {
    public static void main(String[] args) {
        /* 별자리 운세 생성기
        사용자에게 생일 (월, 일)을 입력받으세요!!
        3/21 ~ 4/19 : 양자리
        4/20 ~ 5/20 : 황소자리
        5/21 ~ 6/21 : 쌍둥이자리
        6/22 ~ 7/22 : 게자리
        7/23 ~ 8/22 : 사자자리
        8/23 ~ 9/22 : 처녀자리
        9/23 ~ 10/22 : 천칭자리
        10/23 ~ 11/22 : 전갈자리
        11/23 ~ 12/21 : 사수자리
        12/22 ~ 1/19 : 염소자리
        1/20 ~ 2/18 : 물병자리
        2/19 ~ 3/20 : 물고기자리

        당신은 ""자리 입니다. +
         */

        Scanner sc = new Scanner(System.in);

        String zodiac = "";
        
        System.out.print("생일 월 입력 : ");
        int month = sc.nextInt();

        System.out.print("생일 일 입력 : ");
        int day = sc.nextInt();
        
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)){
            zodiac = "양자리";
        }

        System.out.printf("당신은 %s 입니다.", zodiac);
    }
}
