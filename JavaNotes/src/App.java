import JavaBasicOOP.javaArray.JavaArray;
import javaMultithreading.*;

class A {
    void play() {
        System.out.println("Playing in A");
    }

    void play2() {
        System.out.println("Playing 2 in A");
    }
}

class B extends A {
    void play() {
        System.out.println("Playing in B");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n\nHello, World!\n\n");
        // Runtime.getRuntime().exec("notepad");//will open a new notepad
        // JavaArray javaArray = new JavaArray();
        // javaArray.great();

        A a = new B();
        A b = new A();
        A c = (A) new B();
        a.play();
        a.play2();
        b.play();
        c.play();
        c.play2();
    }
}
