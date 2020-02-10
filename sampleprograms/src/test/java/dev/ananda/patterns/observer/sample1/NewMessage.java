package dev.ananda.patterns.observer.sample1;

public class NewMessage {
    private Object message;

    public NewMessage(Object message) {
        this.message = message;
    }

    public Object getMessage() {
        return message;
    }
}
