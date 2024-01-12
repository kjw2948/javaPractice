package method;

public class MethodEx1 {
    public static void main(String[] args) {
        int sum = add(1,2,3);
        double average = sum / 3.0;
        System.out.println("평균값 : "+ average);

        sum = add(15, 25, 35);
        average = sum / 3.0;
        System.out.println("평균값 : "+ average);
    }

    public static int add(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
}

