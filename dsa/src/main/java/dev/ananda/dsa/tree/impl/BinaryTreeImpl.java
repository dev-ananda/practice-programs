package dev.ananda.dsa.tree.impl;

import dev.ananda.data.BinaryTreeNode;
import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.dsa.queue.IQueue;
import dev.ananda.dsa.queue.QueueImpl;
import dev.ananda.dsa.tree.BinaryTree;
import dev.ananda.dsa.tree.BinaryTreeOperations;

/**
 * Created by Ananda on 19-10-2019.
 */
public class BinaryTreeImpl<T extends Comparable<T>> implements BinaryTree<T>, BinaryTreeOperations<T> {

    private BinaryTreeNode<T> root;
    private long size = 0l;

    public BinaryTreeImpl(){
        this.root = null;
    }

    public boolean isEmpty(){
        return null == this.root;
    }
    
    public void insert(T data){
        BinaryTreeNode<T> newNode =  new BinaryTreeNode<T>(data);
        if(this.isEmpty()){
            root = newNode;
            this.size++;
        } else {
            IQueue<BinaryTreeNode<T>> q = new QueueImpl<>();
            q.enqueue(this.root);

            try {
                while (!q.isEmpty()) {
                    BinaryTreeNode<T> currNode = q.dequeue();

                    if (null == currNode.getLeft()) {
                        currNode.setLeft(newNode);
                        this.size++;
                        return;
                    } else {
                        q.enqueue(currNode.getLeft());
                    }

                    if (null == currNode.getRight()) {
                        currNode.setRight(newNode);
                        this.size++;
                        return;
                    } else {
                        q.enqueue(currNode.getRight());
                    }
                }
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }

    public void levelOrderTraverse() {
        if(this.isEmpty()){
            return;
        }
        IQueue<BinaryTreeNode<T>> q = new QueueImpl<>();
        q.enqueue(this.root);

        try {
            while (!q.isEmpty()) {
                BinaryTreeNode<T> currNode = q.dequeue();
                System.out.println(currNode.getData());
                if(null != currNode.getLeft()){
                    q.enqueue(currNode.getLeft());
                }
                if(null != currNode.getRight()){
                    q.enqueue(currNode.getRight());
                }
            }

        } catch (QueueEmptyException e) {
            e.printStackTrace();
        }
    }

    public void preOrderTraverse(){
        this.preOrderTraverse(this.root);
    }

    private void preOrderTraverse(BinaryTreeNode<T> node){
        if(null == node) {
            return;
        }
        System.out.println(node.getData());
        preOrderTraverse(node.getLeft());
        preOrderTraverse(node.getRight());
    }

    public void inOrderTraverse() {
        inOrderTraverse(this.root);
    }

    private void inOrderTraverse(BinaryTreeNode<T> node){
        if(null == node) {
            return;
        }
        inOrderTraverse(node.getLeft());
        System.out.println(node.getData());
        inOrderTraverse(node.getRight());
    }

    public void postOrderTraverse() {
        postOrderTraverse(this.root);
    }

    private void postOrderTraverse(BinaryTreeNode<T> node){
        if(null == node) {
            return;
        }
        postOrderTraverse(node.getLeft());
        postOrderTraverse(node.getRight());
        System.out.println(node.getData());
    }

    public long getSize() {
        //return this.size;
    	return sizeOf(this.root);
    }
    
    private long sizeOf(BinaryTreeNode<T> node){
    	if(null == node){
    		return 0;
    	}
    	if(node.isLeafNode()){
    		return 1;
    	}
    	return 1+sizeOf(node.getLeft())+sizeOf(node.getRight());
    }

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#getMaxElement()
	 */
	@Override
	public T getMaxElement() {
		return null;
	}
	
	private T getMaxElement(BinaryTreeNode<T> node) {
		if(null ==  node){
			return null;
		}
		T leftMax = getMaxElement(node.getLeft());
		T rightMax = getMaxElement(node.getRight());
		return maximum(node.getData(), leftMax, rightMax);
	}

	/**
	 * @param data
	 * @param leftMax
	 * @param rightMax
	 * @return
	 */
	private T maximum(T data1, T data2, T data3) {
		return data1.compareTo(data2) > 0 ? 
				data1.compareTo(data3) > 0 ? data1 : data3 
						: data2.compareTo(data3)>0?data2:data3;
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#getHeight()
	 */
	@Override
	public int getHeight() {
		return getHeight(this.root);
	}
	
	private int getHeight(BinaryTreeNode<T> node){
		if(null == node){
			return 0;
		}
		if(node.isLeafNode()){
			return 1;
		}
		return 1+Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#printBorder()
	 */
	@Override
	public void printBorderNodes() {
		if(isEmpty()){
			return;
		}
		printLeftBorderNodes();
		printLeafNodes();
		printRightBorderNodes();
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#deleteTree()
	 */
	@Override
	public void deleteTree() {
		// TODO Auto-generated method stub
		deleteTree(this.root);
	}
	
	private void deleteTree(BinaryTreeNode<T> node) {
		if(null == node && node.isLeafNode()){
			return;
		}
		deleteTree(node.getLeft());
		deleteTree(node.getRight());
		node.disconnect();
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#copy()
	 */
	@Override
	public BinaryTree<T> copy() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#mirrorTree()
	 */
	@Override
	public boolean mirrorTree() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#printLeftBorderNodes()
	 */
	@Override
	public void printLeftBorderNodes() {
		printLeftBorderNodes(this.root);
	}
	
	private void printLeftBorderNodes(BinaryTreeNode<T> node){
		if(null == node || node.isLeafNode()){
			return;
		}
		System.out.println(node.getData());
		if(null == node.getLeft()){
			printLeftBorderNodes(node.getRight());
		}else{
			printLeftBorderNodes(node.getLeft());
		}
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#printRightBorderNodes()
	 */
	@Override
	public void printRightBorderNodes() {
		printRightBorderNodes(this.root);
	}
	
	private void printRightBorderNodes(BinaryTreeNode<T> node){
		if(null == node || node.isLeafNode()){
			return;
		}
		System.out.println(node.getData());
		if(null == node.getRight()){
			printRightBorderNodes(node.getLeft());
		} else {
			printRightBorderNodes(node.getRight());
		}
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTree#printLeafNodes()
	 */
	@Override
	public void printLeafNodes() {
		printLeafNodes(this.root);
	}
	
	private void printLeafNodes(BinaryTreeNode<T> node) {
		if(null == node) {
			return;
		}
		if(node.isLeafNode()){
			System.out.println(node.getData());
			return;
		}
		printLeafNodes(node.getLeft());
		printLeafNodes(node.getRight());
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTreeOperations#contains(int)
	 */
	@Override
	public boolean contains(T data) {
		// TODO Auto-generated method stub
		return find(this.root, data);
	}

	/**
	 * @param root2
	 * @param data
	 * @return
	 */
	private boolean find(BinaryTreeNode<T> root, T data) {
		// TODO Auto-generated method stub
		if(null == root){
			return false;
		}
		if(data.equals(root.getData()) ){
			return true;
		}
		return find(root.getLeft(), data) || find(root.getRight(), data);
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTreeOperations#printAncestors(java.lang.Object)
	 */
	@Override
	public void printAncestors(T data) {
		// TODO Auto-generated method stub
		boolean flag = printAncestors(this.root, data);
		if(!flag){
			System.out.println("Data not found");
		}
	}
	
	private boolean printAncestors(BinaryTreeNode<T> root, T data) {
		if(null == root){
			return false;
		}
		if(data.equals(root.getData())){
			return false;
		}
		boolean left = printAncestors(root.getLeft(), data);
		if(left){
			System.out.println(""+root.getData());
			return left;
		}
		boolean right = printAncestors(root.getRight(), data);
		if(right){
			System.out.println(""+root.getData());
		}
		return right;
		
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTreeOperations#equals(dev.ananda.dsa.tree.impl.BinaryTreeImpl)
	 */
	@Override
	public boolean equals(BinaryTreeImpl<T> btree) {
		// TODO Auto-generated method stub
		return equals(this.root, btree.root);
	}
	
	private boolean equals(BinaryTreeNode<T> root1, BinaryTreeNode<T> root2){
		if(null == root1 || null == root2 ){
			return true;
		} else if(null == root1 || null == root2 ){
			return false;
		}
		if(!root1.getData().equals(root2.getData())){
			return false;
		}
		return equals(root1.getLeft(), root2.getLeft()) 
				&& equals(root1.getRight(), root2.getRight());
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTreeOperations#findLevel(java.lang.Comparable)
	 */
	@Override
	public int findLevel(T data) {
		// TODO Auto-generated method stub
		return findLevel(this.root, data, 0);
	}
	
	private int findLevel(BinaryTreeNode<T> root, T data, int level){
		if(null == root){
			return -1;
		}
		if(data.equals(root.getData())){
			return level;
		}
		int left = findLevel(root.getLeft(), data, level+1);
		if(-1 != left){
			return left;
		}
		return findLevel(root.getRight(), data, level+1);
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTreeOperations#getDiameter()
	 */
	@Override
	public int getDiameter() {
		// TODO Auto-generated method stub
		return getDiameter(this.root);
	}
	
	private int getDiameter(BinaryTreeNode<T> root) {
		if(null == root){
			return 0;
		}
		if(root.isLeafNode()){
			return 1;
		}
		int leftDiameter =  getDiameter(root.getLeft());
		int rightDimeter = getDiameter(root.getRight());
		int rootDiameter = 1 + maxPath(root.getLeft()) + maxPath(root.getRight());
		
		return Math.max(rootDiameter, Math.max(rightDimeter, leftDiameter));
	}
	
	private int maxPath(BinaryTreeNode<T> root){
		if(null == root){
			return 0;
		}
		if(root.isLeafNode()){
			return 1;
		}
		return 1+Math.max(maxPath(root.getLeft()), maxPath(root.getRight()));
	}

	/* (non-Javadoc)
	 * @see dev.ananda.dsa.tree.BinaryTreeOperations#areSiblings(java.lang.Comparable, java.lang.Comparable)
	 */
	@Override
	public boolean areSiblings(T data1, T data2) {
		// TODO Auto-generated method stub
		return areSiblings(this.root, data1, data2);
	}

	/**
	 * @param root2
	 * @param data1
	 * @param data2
	 * @return
	 */
	private boolean areSiblings(BinaryTreeNode<T> root, T data1, T data2) {
		// TODO Auto-generated method stub
		
		if(null == root){
			return false;
		}
		if(root.isLeafNode()){
			return false;
		}
		if(root.hasTwoChilds() 
				&& ( (data1.equals(root.getLeft().getData()) && data1.equals(root.getRight().getData())) 
				|| (data1.equals(root.getRight().getData()) && data1.equals(root.getLeft().getData()) ) ) ){
			return true;
		}
		return false;
	}
	
	
}
