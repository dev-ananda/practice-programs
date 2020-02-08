package dev.ananda.dsa.queue.applications;

import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.dsa.queue.QueueImpl;
import dev.ananda.dsa.queue.applications.ReverseQueue;

/**
 * Created by Ananda on 07-10-2019.
 */
public class ReverseQueueRecursive<T> implements ReverseQueue<T> {
    @Override
    public void reverse(QueueImpl<T> q) throws QueueEmptyException {
        if(q.isEmpty()) {
            return;
        }
        T temp = q.dequeue();
        reverse(q);
        q.enqueue(temp);
    }
}
