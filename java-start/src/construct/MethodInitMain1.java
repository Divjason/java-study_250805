package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.nameField = "user1";
        member1.ageField = 15;
        member1.gradeField = 90;

        MemberInit member2 = new MemberInit();
        member2.nameField = "user2";
        member2.ageField = 16;
        member2.gradeField = 80;

        MemberInit[] members = {member1, member2};

        for(MemberInit s: members) {
            System.out.printf("이름 : %s, 나이 : %d, 성적 : %d%n", s.nameField, s.ageField, s.gradeField);
        }
    }
}
