package dev.ananda.dsa.stack;

import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.dsa.exception.StackFullException;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 08-10-2019.
 */
public class StackMinimumImpl<T extends Comparable<T>> implements IStackMinimum<T> {

    IStack<T> stack, minStack;

    @Override
    public T getMinimum() throws StackEmptyException {
        return this.minStack.peek();
    }

    @Override
    public void push(T data) throws StackFullException {
        stack.push(data);
        try {
            if(isEmpty() || data.compareTo(minStack.peek()) <= 0){
                minStack.push(data);
            }
        } catch (StackEmptyException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public T pop() throws StackEmptyException {
        if(isEmpty()){
            throw new StackEmptyException(Constants.EMPTY_STACK_MESSAGE);
        }
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        return stack.pop();
    }

    @Override
    public T peek() throws StackEmptyException {
        return this.stack.peek();
    }

    @Override
    public long getSize() {
        return this.stack.getSize();
    }

    @Override
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}
