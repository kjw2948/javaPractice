package scanner;
import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("덧셈할 두 숫자를 입력합니다 \n");
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("입력한 숫자의 합은 : " + sum + " 입니다. ");
    }
}
