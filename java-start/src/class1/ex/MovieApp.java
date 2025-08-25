package class1.ex;

import java.util.ArrayList;

class Movie {
    // 필드값
    private final String title;
    private final String screen;
    private final int price;

    // 생성자 함수
    public Movie(String title, String screen, int price) {
        this.title = title;
        this.screen = screen;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getScreen() {
        return screen;
    }

    public int getPrice() {
        return price;
    }

    @Override // 위에서 선언한 메서드 함수를 재정의하는 함수다!! 언급
    public String toString() {
        return String.format("[%s] (%s관) - %,d원", title, screen, price);
    }
}

class Reservation {
    private final String customerName;
    private final Movie movie;
    private final int people;

    public Reservation(String customerName, Movie movie, int people) {
        if(people <= 0) throw new IllegalArgumentException("인원 수는 1명 이상이어야 합니다.");

        this.customerName = customerName;
        this.movie = movie;
        this.people = people;
    }

    public int totalPrice() {
        return movie.getPrice() * people;
    }

    @Override
    public String toString() {
        return String.format("예약자: %s | 영화: %s | 인원: %d명 | 총액: %,d원",
                    customerName, movie.getTitle(), people, totalPrice());
    }
}

public class MovieApp {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("인터스텔라", "IMAX", 15000));
        movies.add(new Movie("듄:파트2", "CGV", 14000));
        movies.add(new Movie("탑건:매버릭", "Lotte", 12000));

        System.out.println("==== 현재 상영작 목록 ====");
        for (int i = 0; i < movies.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, movies.get(i));
        }

        Reservation r1 = new Reservation("현빈", movies.get(0), 2);
        Reservation r2 = new Reservation("김태희", movies.get(2), 4);

        System.out.println("==== 예매내역 ====");
        System.out.println(r1);
        System.out.println(r2);

        int totalRevenue = r1.totalPrice() + r2.totalPrice();
        System.out.printf("총 매출 : %,d원", totalRevenue);
    }
}
