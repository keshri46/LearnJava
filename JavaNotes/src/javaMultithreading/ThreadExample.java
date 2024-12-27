package javaMultithreading;

class Counter {
    static int count = 0;

    static synchronized void increment() {
        count++;
    }
}

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi from A" + Thread.currentThread());
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from B" + Thread.currentThread());
        }
    }
}

public class ThreadExample {

    static void normalMultiThreading() {
        Thread a = new Thread(new A());
        Thread b = new B();
        a.start();
        b.start();
    }

    static void synchronizedMultiThreading() throws InterruptedException {

        Thread a = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                Counter.increment();
            System.out.println(Thread.currentThread());
        });
        Thread b = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                Counter.increment();
            System.out.println(Thread.currentThread());
        });

        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(Counter.count);

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        normalMultiThreading();
        synchronizedMultiThreading();
    }
}
