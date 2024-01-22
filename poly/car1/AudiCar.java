package poly.car1;

import poly.car0.Car0;

public class AudiCar extends Car0 {
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
