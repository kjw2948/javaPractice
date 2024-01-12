package scanner;
import java.util.Scanner;
public class ScannerLoop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("입력하신 숫자의 합을 구합니다(종료 희망시 0을 눌러주세요)");
        while(true){
            System.out.print("숫자를 입력해주세요 : ");
            int num = sc.nextInt();
            if(num==0)
                break;
            sum += num;
        }
        System.out.println("숫자 총합은 : " + sum + " 입니다.");
    }

}
