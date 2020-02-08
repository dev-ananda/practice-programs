package dev.ananda.dsa.linkedlist;

import dev.ananda.dsa.exception.ListEmptyException;

/**
 * Created by Ananda on 06-10-2019.
 */
public interface IList <T> extends Iterable<T> {
    void append(T data);
    void delete(T data) throws ListEmptyException;
    void traverse();
    boolean isEmpty();
    long getSize();
    T peek() throws ListEmptyException;
}
