package poly.car0;

public class AudiCar extends Car0{
    @Override
    public void startEngine (){
        System.out.println("AudiCar.startEngine");
    }
    @Override
    public void offEngine(){
        System.out.println("AudiCar.offEngine");
    }
    @Override
    public void pressAccelerator(){
        System.out.println("AudiCar.pressAccelerator");
    }
}
