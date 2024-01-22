package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.sound();
        dog.sound();
        cow.sound();
    }
}
