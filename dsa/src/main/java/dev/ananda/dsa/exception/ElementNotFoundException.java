package dev.ananda.dsa.exception;

/**
 * Created by Ananda on 06-10-2019.
 */
public class ElementNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7442760770137328724L;

	public ElementNotFoundException(String message){
        super(message);
    }
}
