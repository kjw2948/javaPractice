package array;
import java.util.Scanner;
public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력");
        for (int i = number.length-1; i >= 0; i--) {
            System.out.print(number[i]);
            if(i>0)
                System.out.print(", ");
        }
    }
}
