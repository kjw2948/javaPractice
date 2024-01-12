package scanner;
import java.util.Scanner;
public class ScannerLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 숫자를 입력해주세요 (둘다 0일 경우 프로그램 종료)");
        while(true) {
            System.out.print("첫번쩨 숫자를 입력해주세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번쩨 숫자를 입력해주세요 : ");
            int num2 = sc.nextInt();

            if(num1 ==0 && num2 ==0) {
                System.out.println("두 수 모두 0이므로 프로그램을 종료합니다.");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 수의 합은 : " + sum + " 입니다.");
        }
    }
}
