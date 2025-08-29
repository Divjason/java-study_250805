package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.printf("A count = %d%n", data1.count);

        Data1 data2 = new Data1("A");
        System.out.printf("B count = %d%n", data2.count);

        Data1 data3 = new Data1("A");
        System.out.printf("C count = %d%n", data3.count);
    }
}
