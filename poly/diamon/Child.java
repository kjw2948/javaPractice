package poly.diamon;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void commomMethod() {
        System.out.println("Child.commonmethod");
    }
}
