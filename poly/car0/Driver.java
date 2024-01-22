package poly.car0;

public class Driver {

    private Car0 car0;

    public void setCar(Car0 car0){
        this.car0 = car0;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다");
        car0.startEngine();
        car0.offEngine();
        car0.pressAccelerator();

    }

}
