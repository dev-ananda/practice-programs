/**
 * 
 */
package dev.ananda.dsa.queue;

import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 12-Nov-2019 
 */

public class QueueArrayImpl<T> implements IQueue<T> {
	
	private long size;
	private long front, rear;
	
	private T [] queue;
	private int MAX_SIZE_LIMIT;
	
	public QueueArrayImpl(){
		this.MAX_SIZE_LIMIT = Constants.DEFAULT_ARRAY_SIZE;
		queue = (T[]) new Object[this.MAX_SIZE_LIMIT];
		this.front = this.rear = 0;
	}
	
	public QueueArrayImpl(int maxSize){
		this.MAX_SIZE_LIMIT = Constants.DEFAULT_ARRAY_SIZE;
		queue = (T[]) new Object[this.MAX_SIZE_LIMIT];
		this.front = this.rear = 0;
	}
	
	

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.queue.IQueue#enqueue(java.lang.Object)
	 */
	@Override
	public void enqueue(T data) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.queue.IQueue#dequeue()
	 */
	@Override
	public T dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.queue.IQueue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.queue.IQueue#getSize()
	 */
	@Override
	public long getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
