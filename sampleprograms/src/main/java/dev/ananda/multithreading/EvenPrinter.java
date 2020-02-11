package dev.ananda.multithreading;

public class EvenPrinter {
    private Counter counter;

    public EvenPrinter(Counter counter) {
        this.counter = counter;
    }

    public void print() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (counter) {
            while (counter.get() < Counter.MAX) {
                System.out.println("<<EVEN>>");
                if (counter.isOdd()) {
                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread :" + counter.get());
                counter.increment();
                counter.notify();
            }
        }
    }
}
