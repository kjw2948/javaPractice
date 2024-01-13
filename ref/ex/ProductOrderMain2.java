package ref.ex;
import java.util.Scanner;
public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int orderSize = sc.nextInt();
        ProductOrder[] productArray = new ProductOrder[orderSize];

        for (int i = 0; i < productArray.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요 : ");

            System.out.print("상품명: ");
            String productName = sc.next();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            productArray[i] = createProduct(productName, price, quantity);
        }
        printProduct(productArray);
        int totalAmount = getTotalAmount(productArray);
        System.out.println("총 결제 금액: "+ totalAmount);
    }
    public static ProductOrder createProduct(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }
    public static void printProduct(ProductOrder[] productOrder){
        for (ProductOrder order : productOrder) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: "+ order.quantity);
        }
    }
    public static int getTotalAmount(ProductOrder[] productOrder){
        int totalAmount=0;
        for (ProductOrder order : productOrder) {
            totalAmount += order.price* order.quantity;
        }
        return totalAmount;
    }
}
