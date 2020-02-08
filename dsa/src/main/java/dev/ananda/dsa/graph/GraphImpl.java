package dev.ananda.dsa.graph;

import dev.ananda.dsa.linkedlist.IList;
import dev.ananda.dsa.linkedlist.LinkedList;

/**
 * Created by Ananda on 22-10-2019.
 */
public class GraphImpl<T> implements IGraph<T> {

	private int vertices, edges;
	private IList<Integer>[] adjacentNodes;

	@SuppressWarnings("unchecked")
	public GraphImpl(int vertices) {
		this.vertices = vertices;
		this.edges = 0;
		this.adjacentNodes = new LinkedList[vertices];
		for (int i = 0; i < this.vertices; i++) {
			this.adjacentNodes[i] = new LinkedList<>();
		}
	}

	/**
	 * @return the vertices
	 */
	public int getVertices() {
		return vertices;
	}

	@Override
	public void addEdge(int vindex, int windex) {
		this.adjacentNodes[vindex].append(windex);
		this.adjacentNodes[windex].append(vindex);
		this.edges++;
	}

	@Override
	public Iterable<Integer> getAdjacentNodes(int vindex) {
		return this.adjacentNodes[vindex];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dev.ananda.dsa.graph.IGraph#getEdges()
	 */
	@Override
	public int getEdges() {
		return this.edges;
	}
}
