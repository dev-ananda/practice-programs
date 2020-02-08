package dev.ananda.dsa.linkedlist;

import dev.ananda.dsa.exception.ElementNotFoundException;
import dev.ananda.dsa.exception.ListEmptyException;

/**
 * Created by Ananda on 06-10-2019.
 */
public interface IDList<T> {
    void append(T data);
    void delete(T data) throws ListEmptyException, ElementNotFoundException;
    void traverse();
    long getSize();
    boolean isEmpty();
}
