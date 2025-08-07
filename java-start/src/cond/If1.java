package cond;

public class If1 {
    public static void main(String[] args) {
        // 코드를 논리적으로 개연성있게 잘 작성!!
        // Pseudo code Training
        // Pseudo : 가짜의, 유사한
        // 실제 코드를 작성하기 전에, 컴퓨터의 프로그래밍 동작을
        // 인간이 사용하는 언어로 먼저 작성해보는 것!!
        // 만약 18살 이상이면 "성인입니다"를 출력하고, 만약 18살
        // 미만이라면 "미성년자" 입니다.를 출력하세요!!

        // if () -> if 라는 조건문은 반드시 조건식을 검증한 이후 실행!!!
        int age = 16;

        if(age >= 24) {
            System.out.println("성인입니다.");
        }

        if(age >= 20) {
            System.out.println("성인입니다.");
        }

        if(age >= 19) {
            System.out.println("성인입니다.");
        }

        if(age < 18) {
            System.out.println("미성년자입니다.");
        }
    }
}
