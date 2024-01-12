package compare;

public class Operatorprob {
    public static void main(String[] args){
        int grade = 1;
        int coupon ;
        switch(grade) {
            case 0 :
                coupon = 1000;
                break;
            case 1 :
                coupon = 2000;
                break;
            case 2 :
                coupon = 3000;
                break;
            default :
                coupon = 500;
        }
        System.out.println("coupon is = " + coupon);
    }
}
