package dev.ananda.impl;

import org.junit.Before;
import org.junit.Test;

import dev.ananda.dsa.tree.BinaryTree;
import dev.ananda.dsa.tree.impl.BinaryTreeImpl;

import static org.junit.Assert.*;

/**
 * Created by Ananda on 19-10-2019.
 */
public class BinaryTreeTest {

    BinaryTree<Integer> emptyTree;
    BinaryTree<Integer> fullTree;

    @Before
    public void setUp() throws Exception {
        emptyTree = new BinaryTreeImpl<>();
        fullTree = new BinaryTreeImpl<>();
        fullTree.insert(1);
        fullTree.insert(2);
        fullTree.insert(3);
        fullTree.insert(4);
        fullTree.insert(5);
        fullTree.insert(6);
        fullTree.insert(7);
        fullTree.insert(8);
        fullTree.insert(9);
        fullTree.insert(10);
        fullTree.insert(11);
        fullTree.insert(12);
        fullTree.insert(13);
        fullTree.insert(14);
        fullTree.insert(15);
    }

    @Test
    public void isEmptyTestEmptyTree() throws Exception {
        assertEquals(true, emptyTree.isEmpty());
    }

    @Test
    public void insertTestEmptyTree() throws Exception {
        emptyTree.insert(1);
        assertEquals(1, emptyTree.getSize());
    }

    @Test
    public void levelOrderTraverseTestEmptyTree() throws Exception {
        emptyTree.levelOrderTraverse();
    }

    @Test
    public void preOrderTraverseTestEmptyTree() throws Exception {
        emptyTree.preOrderTraverse();
    }

    @Test
    public void inOrderTraverseTestEmptyTree() throws Exception {
        emptyTree.inOrderTraverse();
    }

    @Test
    public void postOrderTraverseTestEmptyTree() throws Exception {
        emptyTree.postOrderTraverse();
    }

    @Test
    public void getSizeTestEmptyTree() throws Exception {
        assertEquals(0, emptyTree.getSize());
    }

    @Test
    public void isEmptyTestFullTree() throws Exception {
        assertEquals(false, fullTree.isEmpty());
    }

    @Test
    public void insertTestFullTree() throws Exception {
        fullTree.insert(16);
        assertEquals(16, fullTree.getSize());
    }

    @Test
    public void levelOrderTraverseTestFullTree() throws Exception {
        fullTree.levelOrderTraverse();
    }

    @Test
    public void preOrderTraverseTestFullTree() throws Exception {
        fullTree.preOrderTraverse();
    }

    @Test
    public void inOrderTraverseTestFullTree() throws Exception {
        fullTree.inOrderTraverse();
    }

    @Test
    public void postOrderTraverseTestFullTree() throws Exception {
        fullTree.postOrderTraverse();
    }

    @Test
    public void getSizeTestFullTree() throws Exception {
        assertEquals(15, fullTree.getSize());
    }

}