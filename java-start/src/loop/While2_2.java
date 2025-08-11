package loop;

public class While2_2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int endNum = 3;

        while(i <= endNum) {
            sum += i;
            System.out.printf("i = %d sum = %d %n", i, sum);
            i++;
        }
    }
}
