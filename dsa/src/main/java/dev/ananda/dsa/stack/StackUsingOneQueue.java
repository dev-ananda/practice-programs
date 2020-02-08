package dev.ananda.dsa.stack;

import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.dsa.queue.IQueue;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 07-10-2019.
 */
public class StackUsingOneQueue<T> implements IStack<T> {

    private IQueue<T> q;

    @Override
    public void push(T data) {
        q.enqueue(data);
    }

    @Override
    public T pop() throws StackEmptyException {
        if(isEmpty()){
            throw new StackEmptyException(Constants.EMPTY_STACK_MESSAGE);
        }
        long qsize = getSize();
        T temp = null;
        try {
            for(int i=0; i<qsize-1; i++){
                q.enqueue(q.dequeue());
            }
            temp = q.dequeue();
        } catch (QueueEmptyException e) {
            throw new RuntimeException(e);
        }
        return temp;
    }

    @Override
    public T peek() throws StackEmptyException {
        return null;
    }

    @Override
    public long getSize() {
        return q.getSize();
    }

    @Override
    public boolean isEmpty() {
        return q.isEmpty();
    }
}
