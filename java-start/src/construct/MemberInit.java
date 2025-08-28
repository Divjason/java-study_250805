package construct;

public class MemberInit {
    String nameField;
    int ageField;
    int gradeField;

    // 멤버변수 내 값을 보다 효율적으로 할당하기 위한 목적으로 만들어진 메서드 함수
    void initMember(String name, int age, int grade) {
        this.nameField = name;
        this.ageField = age;
        this.gradeField = grade;
    }
}
