package JavaBasicOOP.javaAbstraction.interfaces;

import java.util.Random;

public interface FunctionalInterface {

    double pi = 3.14;

    void findArea();

    default int getRadius() {
        Random random = new Random();
        return random.nextInt(10);
    }

}
