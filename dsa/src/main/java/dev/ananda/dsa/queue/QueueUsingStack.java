package dev.ananda.dsa.queue;

import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.dsa.exception.StackFullException;
import dev.ananda.dsa.stack.IStack;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 07-10-2019.
 */
public class QueueUsingStack<T> implements IQueue<T> {

    private IStack<T> s1, s2;
    private long size;

    @Override
    public void enqueue(T data) {
        try {
			this.s1.push(data);
		} catch (StackFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public T dequeue() throws QueueEmptyException {
        if(this.isEmpty()){
            throw new QueueEmptyException(Constants.EMPTY_STACK_MESSAGE);
        }
        T temp = null;
        try {
            if(this.s2.isEmpty()){
                while (!this.s1.isEmpty()){
                    this.s2.push(this.s1.pop());
                }
            }
            temp = this.s2.pop();
        } catch (StackEmptyException e) {
            e.printStackTrace();
        } catch (StackFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return (s1.isEmpty() && s2.isEmpty());
    }

    @Override
    public long getSize() {
        return this.size;
    }
}
