package dev.ananda.dsa.linkedlist;

import java.util.Iterator;

import dev.ananda.data.Node;
import dev.ananda.dsa.exception.ListEmptyException;
import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.dsa.stack.Stackimpl;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 15-09-2019.
 */
public class LinkedList <T> implements IListOperations<T> {

    static final StringBuilder DELIM = new StringBuilder("->");

    private Node<T> head;
    private long size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }
    
    public LinkedList(Node<T> head, long size){
        this.head = head;
        this.size = size;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public boolean isEmpty(){
        return (0==size);
    }

    @Override
    public void append(T data){
        Node<T> newNode = new Node<T>(data);
        if(isEmpty()){
            head = newNode;
            size++;
            return;
        }
        Node<T> temp =  head;
        while(null != temp.getNext()){
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        size++;
    }

    @Override
    public void traverse(){
        if(isEmpty()) {
            System.err.println("List is empty!!!");
        } else {
            Node<T> temp = head;
            StringBuilder listData = new StringBuilder();
            while(null != temp) {
                listData.append(DELIM).append("[ ").append(temp.getData()).append(" ]");
                temp = temp.getNext();
            }
            System.out.println("List elements are : "+listData.toString());
        }
    }

    @Override
    public void delete(T data) throws ListEmptyException {
        if (isEmpty()) {
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }
        Node<T> prev = head;
        if (data.equals(head.getData())) {
            head = head.getNext();
            prev.setNext(null);
            size--;
            return;
        }
        Node<T> curr = head.getNext();
        while (null != curr) {
            if (data.equals(curr.getData())) {
                prev.setNext(curr.getNext());
                curr.setNext(null);
                size--;
                return;
            }
            prev = curr;
            curr = curr.getNext();
        }
    }

    // TODO : add test cases for following methods
    @Override
    public void insertAtBegin(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    @Override
    public T deleteAtBegin() throws ListEmptyException {
        if(isEmpty()){
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }
        Node<T> tempNode = head;
        head = head.getNext();
        tempNode.setNext(null);
        size--;
        return tempNode.getData();
    }

    @Override
    public void insertAtPosition(T data, int position){
        if(1 == position){
            insertAtBegin(data);
            return;
        }
        if(this.isEmpty() || size < position) {
            append(data);
            return;
        }
        Node<T> newNode = new Node<T>(data);
        Node<T> prev = head;
        Node<T> curr= head.getNext();
        int currPos = 2;
        while(currPos < size){
            prev =  curr;
            curr = curr.getNext();
        }
        newNode.setNext(curr);
        prev.setNext(newNode);
        size++;
    }

    @Override
    public T getMiddle() throws ListEmptyException {
        if(isEmpty()){
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }
        if(1 == this.getSize()){
            return head.getData();
        }
        Node<T> slowNode = head;
        Node<T> fastNode = head;

        while (null != fastNode && null != fastNode.getNext() ){
            slowNode = slowNode.getNext();
            fastNode = fastNode.getNext().getNext();
        }
        return slowNode.getData();
    }

    @Override
    public T getLastNode() throws ListEmptyException {

        if(isEmpty()){
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }

        if(1 == this.getSize()){
            return head.getData();
        }

        Node<T> temp = this.head.getNext();
        while (null != temp.getNext()){
            temp = temp.getNext();
        }
        return temp.getData();
    }

    @Override
    public T deleteLastNode() throws ListEmptyException {

        if(isEmpty()){
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }

        Node<T> prev = null;
        Node<T> curr = this.head;
        while (null != curr.getNext()){
            prev = curr;
            curr = curr.getNext();
        }
        prev.setNext(null);
        return curr.getData();
    }

    @Override
    public void printReverse() {
        printReverse(this.head);
    }

    private void printReverse(Node<T> node) {
        if(null == node) {return;}
        printReverse(node.getNext());
        System.out.println(node.getData());
    }

    @Override
    public void reverseListIterative() throws ListEmptyException {
        if(isEmpty()) {
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }

        Node<T> prev = null;
        Node<T> curr = this.head;
        while(null != curr) {
            Node<T> temp = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    @Override
    public void reverseListRecursive() throws ListEmptyException {
        if(isEmpty()) {
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }
        reverseListRecursive(this.head);
    }

    @Override
    public void reverseListRecursiveOptimal() {
        reverseListRecursiveOptimal(null, this.head);
    }

    @Override
    public boolean isPalindrome() throws ListEmptyException {

        if(isEmpty()){
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }
        Stackimpl<T> stack = new Stackimpl<T>();

        Node<T> slow=head, fast=head;
        while (null != fast && null != fast.getNext()){
            stack.push(slow.getData());
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        if(null != fast){
            slow = slow.getNext();
        }
        try {
            while (!stack.isEmpty()) {
                if (!stack.pop().equals(slow.getData())) {
                    return false;
                }
                slow = slow.getNext();
            }
        } catch (StackEmptyException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    private void reverseListRecursiveOptimal(Node<T> prev, Node<T> curr) {
        if(null == curr){
            return;
        }
        reverseListRecursiveOptimal(curr, curr.getNext());
        curr.setNext(prev);
    }

    private Node<T> reverseListRecursive(Node<T> node) {
        if(null == node){
            return null;
        }
        Node<T> temp = reverseListRecursive(node.getNext());
        node.setNext(temp);
        return temp;
    }

	@Override
	public T peek() throws ListEmptyException {
		if(this.isEmpty()){
			throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
		}
		return this.head.getData();
	}

	@Override
	public Iterator<T> iterator() {
		return new ListIterator<T>(this.head, size);
	}
	
	private class ListIterator<Type>  implements Iterator<Type> {

		private Node<Type> itrNode;
		
		public ListIterator(Node<Type> headNode, long size){
			if(0 == size){
				throw new RuntimeException(Constants.EMPTY_LIST_MESSAGE);
			}
			this.itrNode = headNode;
		}
		
		@Override
		public boolean hasNext() {
			return null!=this.itrNode;
		}

		@Override
		public Type next() {
			Type data = itrNode.getData();
			itrNode = itrNode.getNext();
			return data;
		}
		
		@Override
		public void remove(){
			throw new RuntimeException(Constants.OPERATION_NOT_SUPPORTED);
		}

	}
	


}
