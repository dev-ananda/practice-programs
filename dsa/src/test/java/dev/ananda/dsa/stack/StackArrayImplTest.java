/**
 * 
 */
package dev.ananda.dsa.stack;

import org.junit.Before;
import org.junit.Test;

import dev.ananda.dsa.exception.StackFullException;

/**
 * Created by Ananda on 12-Nov-2019 
 */

public class StackArrayImplTest {
	IStack<Integer> stack;
	
	@Before
    public void setUp() throws Exception {
		stack = new StackArrayImpl<Integer>();
	}
	
	@Test
    public void testPush() throws StackFullException{
		stack.push(12);
	}
	
}
