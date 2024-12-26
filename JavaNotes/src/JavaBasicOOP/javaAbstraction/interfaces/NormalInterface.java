package JavaBasicOOP.javaAbstraction.interfaces;

import java.util.Random;

public interface NormalInterface {
    double g = 9.8;

    void findAccleration();

    void findFinalVelocity();

    default int getDistance() {
        Random random = new Random();
        return random.nextInt(100);
    }

    static double findTime(int distance) {
        return Math.sqrt((2 * distance) / g);
    }
}
