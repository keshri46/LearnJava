package JavaBasicOOP.javaAbstraction.interfaces;

import java.util.Random;

public interface FunctionalInterface {

    double pi = 3.14;

    void findCircleArea(int r);

    default int getRadius() {
        Random random = new Random();
        return random.nextInt(10);
    }

}

interface FunctionalInterface2 {

    void findArea(int r);

    default int getRadius() {
        Random random = new Random();
        return random.nextInt(10);
    }

}

interface FunctionalInterface3 {

    void findArea(int r);

    default int getRadius() {
        Random random = new Random();
        return random.nextInt(10);
    }

}

interface FunctionalInterface4 {

    void findArea(int r);

    default int getRadius() {
        Random random = new Random();
        return random.nextInt(10);
    }

}