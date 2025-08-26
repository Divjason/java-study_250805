package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;

        System.out.printf("data = %d%n", data.value);
//        System.out.println("1. data = " + data);
//
//        data = new Data();
//        System.out.println("2. data = " + data);
//
//        data = null;
//        System.out.println("3. data = " + data);
    }
}
