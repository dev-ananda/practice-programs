package dev.ananda.dsa.queue;

import dev.ananda.dsa.exception.QueueEmptyException;

/**
 * Created by Ananda on 06-10-2019.
 */
public interface IQueue<T> {
    void enqueue(T data);
    T dequeue() throws QueueEmptyException;
    boolean isEmpty();
    long getSize();
}
