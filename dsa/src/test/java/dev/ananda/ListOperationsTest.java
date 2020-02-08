package dev.ananda;

import dev.ananda.dsa.linkedlist.IListOperations;
import dev.ananda.dsa.linkedlist.LinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ananda on 06-10-2019.
 */
public class ListOperationsTest {

    private IListOperations<Integer> dataList;


    @Before
    public void setUp() throws Exception {
        dataList = new LinkedList<Integer>();
        dataList.append(100);
        dataList.append(12);
        dataList.append(943);
        dataList.append(432);
        dataList.append(7545);
    }

    @Test
    public void testInsertAtBegin(){
        dataList.insertAtBegin(453);

    }

    @Test
    public void getMiddle() throws Exception {
        assertEquals(new Integer(943), dataList.getMiddle());
    }
}
