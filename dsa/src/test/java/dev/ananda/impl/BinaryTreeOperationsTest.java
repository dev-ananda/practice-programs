/**
 * 
 */
package dev.ananda.impl;

import org.junit.Before;

import dev.ananda.dsa.tree.BinaryTreeOperations;
import dev.ananda.dsa.tree.impl.BinaryTreeImpl;

/**
 * Created by Ananda on 02-Nov-2019 
 */

public class BinaryTreeOperationsTest {
	BinaryTreeOperations<Integer> emptyTree;
	BinaryTreeOperations<Integer> fullTree;
	
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
	
	
	
}
