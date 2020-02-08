package dev.ananda.dsa.stack;

import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.dsa.queue.IQueue;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 07-10-2019.
 */
public class StackUsingQueue<T> implements IStack<T> {

    private IQueue<T> q1, q2;

    @Override
    public void push(T data) {
        if(!this.q1.isEmpty()){
            this.q1.enqueue(data);
        }else{
            this.q2.enqueue(data);
        }
    }

    @Override
    public T pop() throws StackEmptyException {
        if(this.isEmpty()){
            throw new StackEmptyException(Constants.EMPTY_STACK_MESSAGE);
        }
        T temp = null;
        try {
            if (!this.q1.isEmpty()) {
                while (!this.q1.isEmpty()) {
                    this.q2.enqueue(this.q1.dequeue());
                }
                temp = this.q2.dequeue();
            } else {
                while (this.q2.isEmpty()){
                    this.q1.enqueue(this.q2.dequeue());
                }
                temp = this.q1.dequeue();
            }
        }catch (QueueEmptyException e) {
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
        return (this.q1.getSize()+this.q2.getSize());
    }

    @Override
    public boolean isEmpty() {
        return q1.isEmpty() || q2.isEmpty();
    }
}
