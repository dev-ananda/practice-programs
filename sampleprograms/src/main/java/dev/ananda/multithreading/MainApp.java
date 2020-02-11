package dev.ananda.multithreading;

public class MainApp {

    public static void main(String[] args) {

        Counter counter = new Counter();

        OddPrinter op = new OddPrinter(counter);
        EvenPrinter ep = new EvenPrinter(counter);

        Thread t1 = new Thread(() -> op.print());
        Thread t2 = new Thread(() -> ep.print());

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
