package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.printf("메서드 호출 전 : dataA.value = %d%n", dataA.value);
        changeReference(dataA);
        System.out.printf("메서드 호출 전 : dataA.value = %d%n", dataA.value);

        // Data dataX = dataA => dataA.value = 10;
    }
    static void changeReference(Data dataX) {
        dataX.value = 20;
    };
}
