package ref.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i = 0; i < orders.length; i++) {
            System.out.printf("%d 번째 주문 정보를 입력하세요%n", i + 1);

            System.out.print("상품명 : ");
            String productName = scanner.nextLine();

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.printf("총 결제 금액 : %d%n", totalAmount);
    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = productName;
        order1.price = price;
        order1.quantity = quantity;
        return  order1;
    };

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.printf("상품명 : %s, 가격 : %d, 수량 : %d%n", order.productName, order.price, order.quantity);
        }
    };

    static int getTotalAmount(ProductOrder[] orders) {
       int totalAmount = 0;
       for(ProductOrder order : orders) {
           totalAmount += order.price * order.quantity;
       }
       return totalAmount;
    };
}
