package dev.ananda.dsa.graph;

/**
 * Created by Ananda on 22-10-2019.
 */
public interface IGraph<T> {
    void addEdge(int vindex, int w);
    Iterable<Integer> getAdjacentNodes(int vindex);
    int getVertices();
    int getEdges();
}
