package org.example.basicexample;

/*github.com/jules-tnk/ieee_java_course*/
public class CarTest {
    public static void main(String[] args) {
        mainExec();
    }

    public static void mainExec(){
        Car myCar;
        myCar = new Car("Toyota", "Camry", 2010);
        System.out.println("My car's brand is: "+myCar.getBrand());
        myCar.stop();
        myCar.slowDown(10);
        myCar.start();
        System.out.println("Speed: "+myCar.getSpeed());
        myCar.accelerate(20);
        System.out.println("Speed: "+myCar.getSpeed());
        myCar.accelerate(20);
        System.out.println("Speed: "+myCar.getSpeed());
        myCar.slowDown(10);
        System.out.println("Speed: "+myCar.getSpeed());
        myCar.slowDown(50);
        System.out.println("Speed: "+myCar.getSpeed());
    }

}
