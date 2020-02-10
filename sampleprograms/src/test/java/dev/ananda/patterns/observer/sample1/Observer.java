package dev.ananda.patterns.observer.sample1;

public interface Observer {
    public void update();
    public void setSubject(Subject sub);
}
