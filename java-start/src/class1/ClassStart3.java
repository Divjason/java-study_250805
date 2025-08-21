package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;

        student1 = new Student();
        // new 예약어 -> 클래스 -> 프로토타입 객체 -> 인스턴스 객체
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;
        // 온점 표기법

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.printf("이름 : %s, 나이 : %d, 성적 : %d%n", student1.name, student1.age, student1.grade);
        System.out.printf("이름 : %s, 나이 : %d, 성적 : %d%n", student2.name, student2.age, student2.grade);
    }
}
