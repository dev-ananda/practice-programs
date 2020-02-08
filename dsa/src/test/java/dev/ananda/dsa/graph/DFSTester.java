/**
 * 
 */
package dev.ananda.dsa.graph;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ananda on 24-Dec-2019 
 */

public class DFSTester {
	
	IGraph<String> g;
	
	
	
	@Before
    public void setUp() throws Exception {
		g = new GraphImpl<>(7);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 5);
		g.addEdge(0, 6);
		
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		
	}
	
	@Test
    public void testDFS(){
		DepthFirstSearch<String> dfs = new DepthFirstSearch<>(g,0);
	}

}
