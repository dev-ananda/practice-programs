package dev.ananda.dsa.stack;

import dev.ananda.data.Node;
import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 07-10-2019.
 */
public class Stackimpl<T> implements IStack<T> {

    private Node<T> top;
    private long size;

    @Override
    public void push(T data) {
        Node<T> node = new Node<T>(data);
        node.setNext(this.top);
        this.top = node;
        this.size++;
    }

    @Override
    public T pop() throws StackEmptyException {
        if(this.isEmpty()){
            throw new StackEmptyException(Constants.EMPTY_STACK_MESSAGE);
        }
        Node<T> temp = this.top;
        this.top = top.getNext();
        temp.setNext(null);
        this.size++;
        return temp.getData();
    }

    @Override
    public T peek() throws StackEmptyException {
        if(this.isEmpty()){
            throw new StackEmptyException(Constants.EMPTY_STACK_MESSAGE);
        }
        return this.top.getData();
    }

    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return (null==this.top);
    }
}
