package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for(MemberInit s: members) {
            System.out.printf("이름 : %s, 나이 : %d, 성적 : %d%n", s.nameField, s.ageField, s.gradeField);
        }

    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.nameField = name;
        member.ageField = age;
        member.gradeField = grade;
    }
}
