package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        int m1 = 10;
        method1(m1);
    }

    static void method1(int m1){
        System.out.println("method1 start");
        int cal = m1*2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m1){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
