package dev.ananda.dsa.queue.applications;

import dev.ananda.dsa.exception.QueueEmptyException;
import dev.ananda.dsa.queue.QueueImpl;

/**
 * Created by Ananda on 07-10-2019.
 */
public interface ReverseQueue<T> {
    void reverse(QueueImpl<T> q) throws QueueEmptyException;
}
