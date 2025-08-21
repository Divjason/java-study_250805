package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러분들은 지금 온라인 쇼핑몰의 주문 관리 시스템을 제작하려고 합니다.
        // 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 생성해주세요.
        // 해당 클래스는 상품명(productName), 가격(price), 주문수량(quantity) 이라는 멤버변수를 포함!
        // 위 클래스를 활용해서 아래와 같이 3개의 상품 주문 정보를 생성해주세요!
        // 1) 두부, 2000, 2
        // 2) 김치, 5000, 1
        // 3) 콜라, 1500, 2
        // 위 인스턴스 객체로 생성된 상품을 콘솔창에 순서대로 출력될 수 있도록해주세요.
        // 위 상품의 총 결제금액도 콘솔창에 출력될 수 있도록해주세요.

        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.printf("상품명: %s, 가격: %d, 수량:%d%n", order.productName, order.price, order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.printf("총 결제 금액: %d%n", totalAmount);
    }
}
