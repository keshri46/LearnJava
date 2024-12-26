package JavaBasicOOP.javaAbstraction;

abstract class Vehicle {
    abstract void start();
    abstract void drive();
    abstract void stop();

    void soundHorn() {
        System.out.println("Saamne se hatho !!BEEP~BEEP!! ");
    }
}

abstract class Car extends Vehicle {

    abstract void playMusic();

    void drive() {
        System.out.println("Driving car!");

    }

    void stop() {
        System.out.println("Stopping car!");

    }

    void park() {
        System.out.println("Parking car!");
    }

}


class Maruti extends Car {

    
    void playMusic() {
        System.out.println("Playing in maruti!");
    }

    
    void start() {
        System.out.println("Srarting maruti!");
    }
    
}

public class CarExample {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n\n");
        Maruti alto = new Maruti();
        alto.start();
        alto.playMusic();
        alto.drive();
        alto.soundHorn();
        alto.stop();
        alto.park();
    }
    
}
