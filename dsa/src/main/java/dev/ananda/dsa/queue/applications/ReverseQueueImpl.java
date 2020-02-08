package dev.ananda.dsa.queue.applications;

import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.dsa.exception.StackEmptyException;
import dev.ananda.dsa.queue.QueueImpl;
import dev.ananda.dsa.queue.applications.ReverseQueue;
import dev.ananda.dsa.stack.Stackimpl;

/**
 * Created by Ananda on 07-10-2019.
 */
public class ReverseQueueImpl<T> implements ReverseQueue<T> {
    @Override
    public void reverse(QueueImpl<T> q) throws QueueEmptyException {
        if (q.isEmpty()) {
            return;
        }
        if (1 == q.getSize()) {
            return;
        }
        Stackimpl<T> st = new Stackimpl<T>();
        while (!q.isEmpty()) {
            st.push(q.dequeue());
        }
        try {
            while (!st.isEmpty()) {
                q.enqueue(st.pop());
            }
        } catch (StackEmptyException e) {
            e.printStackTrace();
        }

    }
}
