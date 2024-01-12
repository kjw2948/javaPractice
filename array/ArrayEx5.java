package array;
import java.util.Scanner;
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println(size + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if(min>array[i])
                min = array[i];
            if(max<array[i])
                max = array[i];
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
