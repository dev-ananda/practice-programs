package dev.ananda.dsa.exception;

/**
 * Created by Ananda on 15-09-2019.
 */
public class ListEmptyException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5036522940131871185L;

	public ListEmptyException(String message){
        super(message);
    }
}
