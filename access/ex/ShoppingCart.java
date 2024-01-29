package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;
    private int total = 0;
    void addItem(Item item){
        if(count>10){
            System.out.println("장바구니가 가득찼습니다");
            return;
        }
        items[count] = item;
        count ++;
    }

    void displayItems(){
        System.out.println("장바구니 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명:" +items[i].getName() + ", 합계: "+ items[i].getTotal());
            total += items[i].getTotal();
        }
        System.out.println("전체 가격 합: "+ total);
    }
}
