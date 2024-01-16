package extends1.ex2;


public class CarMain {
    public static void main(String[] args) {
        ElcectricCar electric = new ElcectricCar();
        electric.move();
        electric.charge();
        electric.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHyrogen();
        hydrogenCar.openDoor();

    }
}
