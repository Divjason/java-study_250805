package scope;

public class Scope2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {
            sum += i;
            System.out.printf("i = %d sum = %d%n", i, sum);
            i++;
        }
    }
}
