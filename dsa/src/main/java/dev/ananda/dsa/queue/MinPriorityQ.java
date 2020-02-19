package dev.ananda.dsa.queue;

import static dev.ananda.dsa.Utility.*;

public class MinPriorityQ {
    private int[] minPQ;
    private int n = 0;

    public MinPriorityQ() {
        minPQ = new int[11];
    }

    public MinPriorityQ(int size) {
        minPQ = new int[size+1];
    }

    private void swim(int k) {
        while (k > 1 && lessthan(minPQ, k, k / 2)) {
            swap(minPQ, k, k / 2);
            k = k / 2;
        }
    }

    private void sink(int k) {
        while (2 * k < n) {
            int j = 2 * k;
            if (j < n && greaterthan(minPQ, j, j + 1)) {
                j++;
            }
            if(!greaterthan(minPQ, k, j)) break;
            swap(minPQ, k, j);
            k=j;
        }
    }

    public void insert(int k){
        if( n == minPQ.length-1) return;
        minPQ[++n] = k;
        swim(n);
    }

    public int deleteMin(){
        int min = minPQ[1];
        minPQ[1] = minPQ[n];
        n--;
        sink(1);
        return min;
    }

    public static void main(String[] args) {
        MinPriorityQ pq = new MinPriorityQ();

        pq.insert(9);
        pq.insert(5);
        pq.insert(20);
        pq.insert(11);
        pq.insert(4);
        pq.insert(17);
        pq.insert(8);
        pq.insert(13);

        System.out.println("Min = "+pq.deleteMin());
        System.out.println("Min = "+pq.deleteMin());
        System.out.println("Min = "+pq.deleteMin());
        System.out.println("Min = "+pq.deleteMin());
        System.out.println("Min = "+pq.deleteMin());
        System.out.println("Min = "+pq.deleteMin());
        System.out.println("Min = "+pq.deleteMin());

    }

}
