package dev.ananda.dsa.linkedlist;

import dev.ananda.dsa.exception.ListEmptyException;

/**
 * Created by Ananda on 06-10-2019.
 */
public interface IListOperations<T> extends IList<T> {
    void insertAtBegin(T data);
    T deleteAtBegin() throws ListEmptyException;
    void insertAtPosition(T data, int position);
    T getMiddle() throws ListEmptyException;

    T getLastNode() throws ListEmptyException;
    T deleteLastNode() throws ListEmptyException;

    void printReverse();

    void reverseListIterative() throws ListEmptyException;
    void reverseListRecursive() throws ListEmptyException;
    void reverseListRecursiveOptimal();
    boolean isPalindrome() throws ListEmptyException;
}
