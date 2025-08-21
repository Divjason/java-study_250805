package class1.ex;

import java.util.ArrayList;

// Book 클래스 -> 신규 책이 입고 되면, 해당 책정보를 저장
class Book {
    // 필드값
    String title; // 멤버변수
    String author;
    int price;

    // 생성자 함수
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 메서드 함수
    public void printInfo() {
        System.out.printf("제목 : %s, 저자 : %s, 가격 : %d%n", title, author, price);
    }
}

// 책들을 하나의 배열안에 저장할 수 있도록 해주는 클래스
// Generic 타입의 가변적인 배열을 선언!!
// General Hospital => 종합병원
class Library {
    ArrayList<Book> books = new ArrayList<>();
    
    // 메서드 함수 => 빈 배열안에 책정보를 추가할 수 있도록 해주는 함수
    public void addBook(Book book) {
        books.add(book);
    }
    
    // 메서드 함수 => 책 검색 기능
    public void searchBook(String keyword) {
        System.out.printf("검색결과 : %s%n", keyword);
        for(Book book: books) {
            if(book.title.contains(keyword)) {
                book.printInfo();
            }
        }
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("자바 프로그래밍", "David", 25000));
        library.addBook(new Book("파이썬 데이터분석", "Dave", 30000));
        library.addBook(new Book("머신러닝 개론", "Jane", 35000));
        
        library.searchBook("자바");
        library.searchBook("데이터");
    }
}
