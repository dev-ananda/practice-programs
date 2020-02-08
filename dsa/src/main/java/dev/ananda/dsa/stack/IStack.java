package dev.ananda.dsa.stack;

import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.dsa.exception.StackFullException;

/**
 * Created by Ananda on 06-10-2019.
 */
public interface IStack<T> {
    void push(T data) throws StackFullException;
    T pop() throws StackEmptyException;
    T peek() throws StackEmptyException;
    long getSize();
    boolean isEmpty();
}