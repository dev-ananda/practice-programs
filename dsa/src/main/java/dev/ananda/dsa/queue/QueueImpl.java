package dev.ananda.dsa.queue;

import dev.ananda.data.Node;
import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 07-10-2019.
 */
public class QueueImpl<T> implements IQueue<T> {

    private Node<T> front, rear;
    private long size;

    @Override
    public void enqueue(T data) {
        Node<T> node = new Node<T>(data);
        if(this.isEmpty()){
            this.front = node;
            this.rear = node;
            this.size++;
            return;
        }
        this.rear.setNext(node);
        this.rear = node;
        this.size++;
    }

    @Override
    public T dequeue() throws QueueEmptyException {
        if(this.isEmpty()){
            throw new QueueEmptyException(Constants.EMPTY_QUEUE_MESSAGE);
        }
        Node<T> temp = this.front;
        if(this.front == this.rear){
            this.front = null;
            this.rear = null;
        } else {
            this.front = this.front.getNext();
        }
        this.size--;
        return temp.getData();
    }

    @Override
    public boolean isEmpty() {
        return (null==this.front && null==this.rear);
    }

    @Override
    public long getSize() {
        return this.size;
    }
}
