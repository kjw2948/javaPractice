package method;
import java.util.Scanner;
public class MethodEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerCheck = 0;
        int bank = 0;

        while(true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료 ");
            System.out.println("---------------------------------");
            System.out.print("선택 : ");
            customerCheck = sc.nextInt();
            if(customerCheck == 1){
                System.out.print("입금액을 입력하세요 : ");
                bank = deposit(bank, sc.nextInt());
            }
            else if(customerCheck ==2){
                    System.out.print("출금액을 입력하세요 : ");
                    bank = withdraw(bank, sc.nextInt());
            }
            else if(customerCheck ==3)
                System.out.println("현재 잔액 : "+ bank +"원");
            else{
                System.out.println("시스템을 종료합니다");
                break;
            }
        }
    }
    public static int deposit(int bank, int amount){
        bank += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + bank +"원");
        return bank;
    }

    public static int withdraw(int bank, int amount){
        if(bank<amount)
            System.out.println(amount +"원을 출금하려 했으나 잔액이 부족합니다.");
        else {
            bank -= amount;
            System.out.println(amount +"원을 출금하였습니다. 현재 잔액 : "+ bank + "원");
        }
        return bank;
    }
}
