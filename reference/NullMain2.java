package reference;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; // NullPointerExpection 발생
        System.out.println("data = "+ data.value);
    }
}
