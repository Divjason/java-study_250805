package construct;

public class MemberContruct {
    String name;
    int age;
    int grade;
    
    // 생성자 함수 = constructor function
    MemberContruct(String name, int age, int grade) {
        System.out.printf("생성자 호출 name = %s, age = %d, grade = %d%n", name, age, grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
