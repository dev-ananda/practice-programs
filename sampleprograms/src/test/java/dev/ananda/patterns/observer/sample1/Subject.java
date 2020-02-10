package dev.ananda.patterns.observer.sample1;

public interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
    public void postMessage(Object message);
    public NewMessage getMessage();
}
