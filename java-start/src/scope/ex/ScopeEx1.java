package scope.ex;

public class ScopeEx1 {
    static int gold = 100;
    
    public static void main(String[] args) {
        int gold = 50;
        System.out.printf("1단계 - 메인함수 내 금 : %d%n", gold);

        thiefHidesGold();

        System.out.printf("3단계 - 메인함수 내 금은 여전히 : %d%n", gold);
        System.out.printf("4단계 - 클래스 내 전체 금 : %d%n", ScopeEx1.gold);
    }
    
    public static void thiefHidesGold() {
        int gold = 0;
        System.out.printf("2단계 - 도둑이 숨긴 금 : %d%n", gold);
    }
}
