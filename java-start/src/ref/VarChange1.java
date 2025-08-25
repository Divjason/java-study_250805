package ref;

public class VarChange1 {
    public static void main(String[] args) {
        // Java > 변수 > 데이터 타입 크게 보면 2가지 분류

        // 1) 원시타입 = 기본타입 = 기본형 = 기본형타입 (*Primitive Type)
        // int, long, double, boolean
        // 변수를 선언하면, 선언한 변수안에 실제 사용하는 값을 담는 개념

        // 2) 참조타입 = Reference Type
        // Object, Array, String
        // 변수를 선언해서 객체 혹은 배열을 담는 것은 실제 객체, 배열의 원본값을 x
        // 컴퓨터 메모리 공간안에 어딘가 생성되어있는 객체, 배열의 값을 찾아온 주소값

        // stack, heap

        int a = 10, b = 20;
        int sum = a + b;
        System.out.println(sum);

        Student s1 = new Student();
        Student s2 = new Student();

//        s1 + s2;

        s1.grade = 100;
        s2.grade = 90;

        int sum1 = s1.grade + s2.grade;
        System.out.println(sum1);

        // 원시타입 VS 참조타입 차이점 - 1
        int a1 = 10;
        int b1 = a1;

        System.out.println(a1);
        System.out.println(b1);

        Student s3 = new Student();
        Student s4 = s3;

        System.out.println(s3);
        System.out.println(s4);

        a1 = 20;
        System.out.println("변경 a1 = 20");
        System.out.println(a1);
        System.out.println(b1);

        b1 = 30;
        System.out.println("변경 b1 = 30");
        System.out.println(a1);
        System.out.println(b1);

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println(dataA);
        System.out.println(dataB);

        dataA.value = 20;
        System.out.println(dataA.value);
        System.out.println(dataB.value);

        dataB.value = 30;
        System.out.println(dataA.value);
        System.out.println(dataB.value);
    }
}
