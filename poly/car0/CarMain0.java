package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car0 k3Car = new K3Car();
        Car0 audiCar = new AudiCar();

        driver.setCar(k3Car);
        driver.drive();

        driver.setCar(null);
        driver.setCar(audiCar);
        driver.drive();
    }
}
