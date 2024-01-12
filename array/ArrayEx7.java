package array;
import java.util.Scanner;
public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;
        int selectCustomer = 0;

        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
        while(selectCustomer!=3 && productCount<10){
            System.out.print("메뉴를 선택하세요 : ");
            selectCustomer = sc.nextInt();
            if(selectCustomer==1){
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = sc.next();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = sc.nextInt();
                productCount++;
            }
            else if(selectCustomer ==2){
                if(productCount==0)
                    System.out.println("등록된 상품이 없습니다");
                else {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                }
            }
        }
        System.out.println("프로그램이 종료됩니다");
    }
}
