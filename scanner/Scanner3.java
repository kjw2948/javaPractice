package scanner;
import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번쨰 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();

        if(num1 > num2)
            System.out.println(num1 +" 이 더 큰 숫자입니다");
        else if(num1 < num2)
            System.out.println(num2 +" 이 더 큰 숫자입니다");
        else
            System.out.println("두 숫자는 같습니다");
    }
}
