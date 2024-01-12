package array;
import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("출력");
        for (int i : number) {
            if(i!=5)
            System.out.print(i +", ");
            else
                System.out.print(i);
        }
    }
}
