package array;

public class EnhancedFor2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int i = 0;

        for(int number : numbers) {
            System.out.printf("number %d번의 결과는: %d%n", i, number);
            i++;
        }
    }
}
