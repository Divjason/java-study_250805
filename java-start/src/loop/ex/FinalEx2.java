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

//        String text01 = "오늘은 새로운 도전을 해보세요!";
//        String text02 = "예상치 못한 좋은 소식이 있습니다!";
//        String text03 = "작은 변화가 큰 성과로 이어집니다!";
//        String text04 = "조심해야 할 하루입니다!";

        String[] fortunes = {
                "오늘은 새로운 도전을 해보세요!", // 0
                "조심해야 할 하루입니다!", // 1
                "예상치 못한 좋은 소식이 있습니다!", // 2
                "평온하고 안정적인 하루를 보낼 수 있어요.", // 3
                "주변 사람들과의 대화에서 기회를 잡을 수 있습니다.", // 4
                "작은 변화가 큰 성과로 이어집니다!" // 5
        };

        String zodiac = "";
        
        System.out.print("생일 월 입력 : ");
        int month = sc.nextInt();

        System.out.print("생일 일 입력 : ");
        int day = sc.nextInt();
        
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) zodiac = "양자리";
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) zodiac = "황소자리";
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) zodiac = "쌍둥이자리";
        else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) zodiac = "게자리";
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) zodiac = "사자자리";
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) zodiac = "처녀자리";
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) zodiac = "천칭자리";
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 22)) zodiac = "전갈자리";
        else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) zodiac = "사수자리";
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) zodiac = "염소자리";
        else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) zodiac = "물병자리";
        else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) zodiac = "물고기자리";

        int rand= (int)(Math.random() * fortunes.length);
        System.out.printf("%s의 오늘의 운세 : %s %n", zodiac, fortunes[rand]);
    }
}
