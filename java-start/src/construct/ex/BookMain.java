package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // 1.Book 클래스를 선언
        // 2.Book 클래스는 책제목, 책저자, 페이지 수의 정보를 저장할 수 있는 멤버변수 선언
        // 3.해당 클래스 내 멤버변수 안에 값을 저장할 수 있도록 해주는 생성자 함수도 선언
        // 4.해당 클래스 안에 멤버변수의 값을 출력할 수 있게 해주는 메서드 함수도 하나 선언
        // 5.메서드 함수를 호출하게 되면 아래와 같이 콘솔창에 출력될 수 있도록 해주세요.
        // => 제목 : ooo, 저자 : ooo, 페이지 : ooo


        Book book1 = new Book("Java", "David", 350);
        book1.displayInfo();

        Book book2 = new Book("Java", "David");
        book2.displayInfo();

        Book book3 = new Book();
        book3.displayInfo();
    }
}
