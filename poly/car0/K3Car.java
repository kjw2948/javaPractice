package poly.car0;

public class K3Car extends Car0{
    @Override
    public void startEngine(){
        System.out.println("K3Car.startEngine");
    }
    @Override
    public void offEngine(){
        System.out.println("K3Car.offEngine");
    }
    @Override
    public void pressAccelerator(){
        System.out.println("K3Car.pressAccelerator");
    }
}
