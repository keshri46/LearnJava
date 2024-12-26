package javaMultithreading;

public class ABC extends Thread {
    Thread threadToInterrupt = new Thread();

    // overriding the run() method
    public void run() {
        // invoking the method interrupt
        System.out.println(threadToInterrupt.getName());
        System.out.println(Thread.currentThread().getName());
        threadToInterrupt.interrupt();
    }
}

class ThreadTest {
    // main method
    public static void main(String[] argvs) {
        try {
            // creating an object of the class ABC
            System.out.println(Thread.currentThread().getName());
            ABC th1 = new ABC();
            System.out.println(Thread.currentThread().getName());
            // th1.threadToInterrupt = Thread.currentThread();
            th1.start();
            System.out.println(Thread.currentThread().getName());
            // invoking the join() method leads
            // to the generation of InterruptedException
            th1.join();
        } catch (InterruptedException ex) {
            System.out.println("The exception has been caught. " + ex);
        }
    }
}