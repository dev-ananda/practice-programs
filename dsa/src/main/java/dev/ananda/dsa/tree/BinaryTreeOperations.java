/**
 * 
 */
package dev.ananda.dsa.tree;

import dev.ananda.dsa.tree.impl.BinaryTreeImpl;

/**
 * Created by Ananda on 02-Nov-2019 
 */

public interface BinaryTreeOperations<T extends Comparable<T>> extends BinaryTree<T>{
	
	T getMaxElement();
    
    int getHeight();
    
    void printLeftBorderNodes();
    void printRightBorderNodes();
    void printLeafNodes();
    void printBorderNodes();
    
    void deleteTree();
    
    BinaryTree<T> copy();
    
    boolean mirrorTree();
    
    boolean contains(T data);
    void printAncestors(T data);
    
    boolean equals(BinaryTreeImpl<T> btree);
    int findLevel(T data);
    int getDiameter();
    
    boolean areSiblings(T data1, T data2);
    
}
