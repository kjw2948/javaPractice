package poly.diamon;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.commomMethod();

        Child child = new Child();
        child.commomMethod();
        child.methodA();
        child.methodB();
    }
}
