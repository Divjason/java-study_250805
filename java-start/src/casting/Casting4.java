package casting;

public class Casting4 {
    public static void main(String[] args) {
       int div1 = 3 / 2;
       System.out.printf("div1 = %d%n", div1);

       double div2 = 3 / 2;
       System.out.printf("div2 = %f%n", div2);

       double div3 = 3.0 / 2;
       System.out.printf("div3 = %f%n", div3);

       double div4 = (double) 3 / 2;
       System.out.printf("div4 = %f%n", div4);

    }
}
