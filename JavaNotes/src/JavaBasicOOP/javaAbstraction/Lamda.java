package JavaBasicOOP.javaAbstraction;

import JavaBasicOOP.javaAbstraction.interfaces.FunctionalInterface;

public class Lamda {
    public static void main(String[] args) {
        lamdaWithSingleLine();

    }

    static void lamdaWithSingleLine() {
        FunctionalInterface functionalInterface = (r) -> System.out.println("\n\n\n\nArea = " + (int) (FunctionalInterface.pi * r * r) + " m^2");
        int r = functionalInterface.getRadius();
        functionalInterface.findCircleArea(r);
    }

    static void lamdaWithMultipleLine() {

    }

    static void lamdaWithSingleReturnLine() {

    }

    static void lamdaWithMutipleReturnLine() {

    }

}
