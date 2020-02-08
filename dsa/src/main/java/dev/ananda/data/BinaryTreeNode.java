package dev.ananda.data;

/**
 * Created by Ananda on 19-10-2019.
 */
public class BinaryTreeNode<T> {
    private T data;
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;

    public BinaryTreeNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public boolean isLeafNode(){
        return (null==this.left && null==this.right);
    }
    
    public boolean hasTwoChilds(){
        return (null!=this.left && null!=this.right);
    }

	/**
	 * 
	 */
	public void disconnect() {
		this.left = null;
		this.right = null;
	}
}
