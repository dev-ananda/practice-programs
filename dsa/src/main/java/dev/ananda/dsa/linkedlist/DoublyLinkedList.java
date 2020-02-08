package dev.ananda.dsa.linkedlist;

import dev.ananda.data.DNode;
import dev.ananda.dsa.exception.ElementNotFoundException;
import dev.ananda.dsa.exception.ListEmptyException;
import dev.ananda.global.Constants;

/**
 * Created by Ananda on 06-10-2019.
 */
public class DoublyLinkedList<T> implements IDList<T> {

    private long size;
    private DNode<T> head;

    static final StringBuilder DELIM = new StringBuilder("->");

    @Override
    public void append(T data) {
        DNode<T> node = new DNode<T>(data);
        if(isEmpty()){
            this.head = node;
            this.size++;
            return;
        }
        DNode<T> temp = this.head;
        while(null != temp.getNext()){
            temp = temp.getNext();
        }
        temp.setNext(node);
        node.setPrev(temp);
        this.size++;
    }

    @Override
    public void delete(T data) throws ListEmptyException, ElementNotFoundException {
        if(isEmpty()){
            throw new ListEmptyException(Constants.EMPTY_LIST_MESSAGE);
        }
        DNode<T> temp = this.head;
        while(null != temp){
            if(data.equals(temp.getData())){

                temp.getPrev().setNext(temp.getNext());

                // check if the delete node is not last node
                if(null != temp.getNext()){
                    temp.getNext().setPrev(temp.getPrev());
                }
                temp.setPrev(null);
                temp.setNext(null);
                return;
            }
        }
        throw new ElementNotFoundException(Constants.ELEMENT_NOT_FOUND);
    }

    @Override
    public void traverse() {
        if(this.isEmpty()){
            System.err.println(Constants.EMPTY_LIST_MESSAGE);
        } else {
            DNode<T> temp = head;
            StringBuilder listData = new StringBuilder();
            while(null != temp) {
                listData.append(DELIM).append("[ ").append(temp.getData()).append(" ]");
                temp = temp.getNext();
            }
            System.out.println("List elements are : "+listData.toString());
        }
    }

    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return (null==this.head);
    }
}
