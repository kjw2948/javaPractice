package access.ex1;

public class ShoppingCart {
    private int itemCount;
    private Item[] itemCart = new Item[10];


    public void addItem(Item item){
        if(itemCount>=itemCart.length){
            System.out.println("장바구니가 가득찼습니다");
            return;
        }
        itemCart[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = itemCart[i];
            System.out.println("상품명:"+item.getName()+", 가격:"+item.getPrice());
        }
        System.out.println("총 가격:"+ getTotalPrice());
    }
    private int getTotalPrice(){
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = itemCart[i];
            total += item.getPrice();
        }
        return total;
    }
}
