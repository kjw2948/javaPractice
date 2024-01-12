package method;

public class MethodEx2 {
    public static void main(String[] args) {
        iteral(3, "Hello, World");
    }
    public static void iteral(int a, String message){
        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
    }
}
