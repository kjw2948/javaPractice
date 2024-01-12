package scanner;
import java.util.Scanner;
public class ScannerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("문자열을 입력해주세요(exit 입력시 종료) : ");
            String str = sc.nextLine();
            if(str.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println(str);
        }
    }
}
