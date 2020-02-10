package dev.ananda.patterns.observer.sample1;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private boolean changed;
    private NewMessage message;

    private final Object MUTEX = new Object();

    public MyTopic() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (null == obj) {
            throw new NullPointerException("Observer cannot be null to register !!!");
        }
        synchronized (MUTEX) {
            if (!observers.contains(obj)) {
                observers.add(obj);
            }
        }
    }

    @Override
    public void unregister(Observer obj) {
        if (null == obj) {
            throw new NullPointerException("Observer cannot be null to unregister !!!");
        }
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        if (this.changed) {
            observers.forEach((obj) -> {
                obj.update();
            });
        }
    }

    @Override
    public void postMessage(Object message) {
        System.out.println("New update !! Mesage is posted to Topic !!");
        this.changed = true;
        this.message = new NewMessage(message);
        notifyObservers();
        this.changed = false;
    }

    @Override
    public NewMessage getMessage() {
        return message;
    }

}
