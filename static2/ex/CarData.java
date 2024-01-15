package static2.ex;

public class CarData {
    private String name;
    private static int count;

    CarData(String name){
        this.name = name;
        count++;
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + count);
    }
}
