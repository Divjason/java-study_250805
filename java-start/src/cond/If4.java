package cond;

public class If4 {
    public static void main(String[] args) {
        // 변수를 하나 선언해주세요 -> 상품가격 입력
        // 추가로 변수를 하나 더 선언 -> 나이를 입력

        // 조건문을 사용해서 아래 구문을 구현
        // 만약 상품가격이 1만원 이상이라면 할인을 1000원
        // 만약 나이가 10살 이하라면 또 추가로 1000원 할인 받게하고 싶습니다.
        // 최종적으로는 콘솔창에 상품가격과 나이에 따라서 할인적용이 다르게 적용되도록 해주시고, 최종 할인가격은 콘솔창에 출력

        int price = 9000;
        int age = 12;
        int discount = 0;

        if(price >= 10000) {
            discount += 1000; // 대입연산자 // 복문
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if(age <= 10) {
            discount += 1000; // 대입연산자
            System.out.println("어린이 구매, 1000원 할인");
        }
        
        System.out.println("총 할인금액 : " + discount + "원");
    }
}
