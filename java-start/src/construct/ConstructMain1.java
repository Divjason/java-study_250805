package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberContruct member1 = new MemberContruct("user1", 15, 90);
        MemberContruct member2 = new MemberContruct("user2", 16, 80);

        MemberContruct[] members = {member1, member2};

        for (MemberContruct s: members) {
            System.out.printf("이름 : %s, 나이 : %d, 성적 : %d%n", s.name, s.age, s.grade);
        }
    }
}
