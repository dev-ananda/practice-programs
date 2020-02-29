package dev.ananda.multithreading.sample1;

public class Counter extends Thread {
    private int count = 0;

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(100l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(++count);
    }

    public static void main(String[] args) {
        Thread t1 = new Counter();

        try {
            t1.start();
            t1.start();
        }catch (Exception e){
            e.printStackTrace();
        }
        Thread t2 = new Counter();
        t2.start();

        System.out.println(Thread.currentThread().getName());

    }
}
