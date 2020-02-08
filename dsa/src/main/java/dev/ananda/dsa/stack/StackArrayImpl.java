/**
 * 
 */
package dev.ananda.dsa.stack;

import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.dsa.exception.StackFullException;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 27-Oct-2019 
 */

public class StackArrayImpl<T> implements IStack<T> {

	private T [] stack;
	private int MAX_SIZE_LIMIT;
	private int top;
	private long size;
	
	public StackArrayImpl(){
		this.MAX_SIZE_LIMIT = Constants.DEFAULT_ARRAY_SIZE;
		stack = (T[]) new Object[this.MAX_SIZE_LIMIT];
		this.top = -1;
		this.size = 0;
	}
	
	public StackArrayImpl(int maxSize){
		this.MAX_SIZE_LIMIT = maxSize;
		stack = (T[]) new Object[this.MAX_SIZE_LIMIT];
		this.top = -1;
		this.size = 0;
	}
	
	@Override
	public void push(T data) throws StackFullException {
		if(this.isFull()){
			throw new StackFullException(Constants.STACK_FULL_MESSAGE);
		}
		this.stack[++this.top] = data;
		this.size++;
	}

	@Override
	public T pop() throws StackEmptyException {
		if(this.isEmpty()){
			throw new StackEmptyException(Constants.EMPTY_STACK_MESSAGE);
		}
		T temp = this.stack[this.top];
		this.top--;
		this.size--;
		return temp;
	}

	@Override
	public T peek() throws StackEmptyException {
		if(this.isEmpty()){
			throw new StackEmptyException(Constants.EMPTY_STACK_MESSAGE);
		}
		return stack[this.top];
	}

	@Override
	public long getSize() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return 0==this.top;
	}
	
	public boolean isFull(){
		return this.MAX_SIZE_LIMIT==this.top;
				
	}

}
