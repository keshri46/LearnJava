package JavaBasicOOP.javaAbstraction.interfaces;

class Functional implements FunctionalInterface {

    public void findArea() {
        double r = getRadius();
        System.out.println("Area = " + (int) (pi * r * r));
    }

}

class Marker implements MarkerInterface {

    public void Greet() {
        System.out.println("Great work!");
    }

}

class Normal implements NormalInterface {

    public void Greet() {
        System.out.println("Great Normal work!");
    }

    @Override
    public void findAccleration() {
        System.out.println("Acc = " + g + "m/s^2");
    }

    @Override
    public void findFinalVelocity() {
        int distance = getDistance();
        System.out.println(
                "Final Velocity v with v=u+at, since u=0 => " + (int) (NormalInterface.findTime(distance) * g));
        System.out.println("Final Velocity v with v2=u2 + 2as, since u=0 => " + (int) Math.sqrt(2 * g * distance));
    }

}

public class InterfaceImplementation {
    public static void main(String[] args) {

        NormalInterface n = new Normal();
        n.findAccleration();
        n.findFinalVelocity();

        FunctionalInterface f = new Functional();
        f.findArea();

        Marker m = new Marker();
        if (m instanceof MarkerInterface) {
            m.Greet();
        }
    }
}
