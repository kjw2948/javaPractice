package poly.ex2;

public abstract class FindPay {
    public static Pay findPay(String option){
        if(option == "kakao"){
            Pay kakaopay = new KakaoPay();
            return kakaopay;
        }
        else if(option =="naver"){
            Pay naverpay = new NaverPay();
            return naverpay;
        }
        else{
            Pay bad = new Bad();
            return bad;
        }
    }
}
