package static2.ex;
public class CarMain {
    public static void main(String[] args) {
        CarData car1 = new CarData("K3");
        CarData car2 = new CarData("G80");
        CarData car3 = new CarData("Model Y");

        CarData.showTotalCars();
    }
}
