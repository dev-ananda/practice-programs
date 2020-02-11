package dev.ananda.multithreading;

public class Counter {

    private int counter = 1;

    public static final int MAX = 20;
    private boolean odd = true;

    public boolean isOdd() {
        return this.odd;
    }

    public void increment() {
        counter = counter + 1;
        this.odd = counter % 2 == 1;
    }

    public int get() {
        return this.counter;
    }

}
