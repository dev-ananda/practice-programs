package dev.ananda.data;

/**
 * Created by Ananda on 06-10-2019.
 */
public class DNode<T> {
    private T data;
    private DNode<T> next;
    private DNode<T> prev;

    public DNode(T data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

    public DNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DNode<T> prev) {
        this.prev = prev;
    }
}
