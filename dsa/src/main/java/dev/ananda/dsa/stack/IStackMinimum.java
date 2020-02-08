package dev.ananda.dsa.stack;

import dev.ananda.dsa.exception.StackEmptyException;

/**
 * Created by Ananda on 08-10-2019.
 */
public interface IStackMinimum<T extends Comparable<T>> extends IStack<T> {
    T getMinimum() throws StackEmptyException;
}
