package dev.ananda.dsa.graph;

/**
 * Created by Ananda on 24-Oct-2019 
 */

public class DepthFirstSearch<T> {
	
	private boolean [] marked;
	
	private String [] dataArr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
	
	public DepthFirstSearch(IGraph<T> g, int start){
		marked = new boolean[g.getVertices()];
		depthFirstSearch(g, start);
	}
	
	/**
	 * @param g
	 * @param v
	 */
	private void depthFirstSearch(IGraph<T> g, int v) {
		marked[v] = true;
		Iterable<Integer> adj = g.getAdjacentNodes(v);

		System.out.println(" "+dataArr[v]);

		for(int w : adj){
			if(!marked[w]){
				depthFirstSearch(g, w);
			}
		}
	}

}
