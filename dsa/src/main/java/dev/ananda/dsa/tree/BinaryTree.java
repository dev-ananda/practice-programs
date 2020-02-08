package dev.ananda.dsa.tree;

/**
 * Created by Ananda on 19-10-2019.
 */
public interface BinaryTree<T> {

    void insert(T data);
    void levelOrderTraverse();
    void preOrderTraverse();
    void inOrderTraverse();
    void postOrderTraverse();

    long getSize();
    boolean isEmpty();

}
