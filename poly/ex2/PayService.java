package poly.ex2;

public class PayService extends FindPay{
    public void processPay(String option, int amount) {
        boolean result;
        Pay pay =FindPay.findPay(option);
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

}