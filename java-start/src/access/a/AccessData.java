package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.printf("publicMethod 호출 %d%n", publicField);
    }

    void defaultMethod() {
        System.out.printf("defaultMethod 호출 %d%n", defaultField);
    }

    private void privateMethod() {
        System.out.printf("privateMethod 호출 %d%n", privateField);
    }
    
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
