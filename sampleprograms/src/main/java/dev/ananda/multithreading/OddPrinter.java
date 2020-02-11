package dev.ananda.multithreading;

public class OddPrinter {
    private Counter counter;

    public OddPrinter(Counter counter) {
        this.counter = counter;
    }

    public void print() {
        synchronized (counter) {
            while (counter.get() < counter.MAX) {
                System.out.println("<<ODD>>>>");
                if (!counter.isOdd()) {
                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + counter.get());
                counter.increment();
                counter.notify();
            }
        }
    }

}
