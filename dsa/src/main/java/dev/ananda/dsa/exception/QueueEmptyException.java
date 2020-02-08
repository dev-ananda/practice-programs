package dev.ananda.dsa.exception;

/**
 * Created by Ananda on 07-10-2019.
 */
public class QueueEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6064223822508262731L;

	public QueueEmptyException(String message){
        super(message);
    }
}
