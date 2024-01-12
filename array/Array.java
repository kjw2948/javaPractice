package array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] array = new int[5]; // 배열은 자동으로 초기화 0 / false / null
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("배열의 값을 입력해주세요 : ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("배열의 " + (i+1) + "번째값은 " + array[i] + " 입니다.");
        }
    }
}
