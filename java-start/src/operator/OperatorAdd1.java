package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        ++a;
        System.out.println(a);

        ++a;
        System.out.println(a);

        // 증가 혹은 감소 연산자는 표기하는 위치에 따라서
        // 연산의 순서가 상이하다!!!
        // ++a : 전위(PreFix) 연산자 : 증가부터 먼저 -> 다른 연산
        // a++ : 후위(PostFix) 연산자 : 다른 연산 -> 증가

        int c = 1;
        int d = 0;

        d = ++c;
        System.out.println(d);

        c = 1;
        d = 0;

        d = c++;
        System.out.println(d);
    }
}
