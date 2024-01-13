package ref.ex;
public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productArray = new ProductOrder[3];
        int totalPrice = 0;

        productArray[0] =  createProduct("두부", 2000,2);
        productArray[1] = createProduct("김치", 5000,1);
        productArray[2] = createProduct("콜라", 1500,2);
        printProduct(productArray);
        totalPrice = getTotalAmount(productArray);
        System.out.println("총 결제 금액: "+ totalPrice);
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
