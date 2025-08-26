package ref;

public class Method2 {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        initStudent(student1, "학생1", 15, 90);
//
//        Student student2 = new Student();
//        initStudent(student2, "학생2", 16, 80);
//
//        printStudent(student1);
//        printStudent(student2);

        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name= name;
        student.age= age;
        student.grade= grade;
        return student;
    };

//    static void initStudent(Student student, String name, int age, int grade) {
//        student.name = name;
//        student.age = age;
//        student.grade = grade;
//    }
//
    static void printStudent(Student student1) {
        System.out.printf("이름 : %s, 나이 : %d, 성적 : %d%n", student1.name, student1.age, student1.grade);
    }
}
