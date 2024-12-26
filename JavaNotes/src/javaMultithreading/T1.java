package javaMultithreading;


class ABCD extends Thread {
    // Thread threadToInterrupt = new Thread();
    static int x = 0;
    Iterator s;

    // overriding the run() method
    public void run() {
        // invoking the method interrupt
        // System.out.println(Thread.currentThread());
        // System.out.println(Thread.currentThread().getName());
        // threadToInterrupt.interrupt();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < 2; i++) {
            // System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + ", x = " + ++x);
            System.out.println(Thread.currentThread().getName() + ", i = " + i);

        }

    }
}

class T1 {
    // main method
    public static void main(String[] argvs) {
        try {
            // creating an object of the class ABC
            System.out.println(Thread.currentThread().getName());
            ABCD th1 = new ABCD();
            ABCD th2 = new ABCD();
            // System.out.println(Thread.currentThread().getName());
            // th1.threadToInterrupt = Thread.currentThread();
            th1.start();
            th1.join();
            th2.start();
            // System.out.println(Thread.currentThread().getName());
            // invoking the join() method leads
            // to the generation of InterruptedException
            // 
        } catch (Exception ex) {
            System.out.println("The exception has been caught. " + ex);
        }
    }
}