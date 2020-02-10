package dev.ananda.patterns.observer.sample1;

import java.util.Objects;

public class MyTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        NewMessage message = topic.getMessage();
        if(null == message){
            System.out.println("Malformed update !!!");
            return;
        }
        System.out.printf(this + "Consuming update '%s'\n", message.getMessage());
    }

    @Override
    public void setSubject(Subject sub) {
        if(null == sub){
            throw new NullPointerException("Subject cannot be null !!!");
        }
        this.topic = sub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTopicSubscriber that = (MyTopicSubscriber) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(topic, that.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, topic);
    }
}
