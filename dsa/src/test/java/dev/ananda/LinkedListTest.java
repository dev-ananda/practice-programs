package dev.ananda;

import dev.ananda.dsa.exception.ListEmptyException;
import dev.ananda.dsa.linkedlist.IList;
import dev.ananda.dsa.linkedlist.LinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ananda on 15-09-2019.
 */
public class LinkedListTest {

    private IList<Integer> dataList;
    private IList<Integer> emptyList;

    @Before
    public void setUp() throws Exception {
        dataList = new LinkedList<Integer>();
        emptyList = new LinkedList<Integer>();

        dataList.append(100);
        dataList.append(12);
        dataList.append(943);
        dataList.append(432);
        dataList.append(7545);
    }

    @Test
    public void testEmptyListGetSize(){
        assertEquals(0, emptyList.getSize());
    }

    @Test
    public void testDataListGetSize() throws Exception {
        assertEquals(5, dataList.getSize());
    }

    @Test
    public void testEmptyListIsEmpty() throws Exception {
        assertEquals(true, emptyList.isEmpty());
    }

    @Test
    public void testDataListIsEmpty() throws Exception {
        assertEquals(false, dataList.isEmpty());
    }

    @Test
    public void testEmptyListAppend() throws Exception {
        emptyList.append(10);
        assertEquals(1, emptyList.getSize());
    }

    @Test
    public void testDataListAppend() throws Exception {
        dataList.append(10);
        assertEquals(6, dataList.getSize());
    }

    @Test
    public void testEmptyListTraverse() throws Exception {
        emptyList.traverse();
    }

    @Test
    public void testDataListTraverse() throws Exception {
        dataList.traverse();
    }

    @Test (expected = ListEmptyException.class)
    public void testEmptyListdelete() throws Exception {
        emptyList.delete(100);
        assertEquals(0, emptyList.getSize());
    }

    @Test
    public void testDataListdelete() throws Exception {
        dataList.delete(100);
        assertEquals(4, dataList.getSize());
    }



}