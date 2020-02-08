/**
 * 
 */
package dev.ananda.dsa.string;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ananda on 27-Oct-2019 
 */

public class GenerateSubStringTest {
	
	GenerateSubString obj;
	
	@Before
    public void setUp() throws Exception {
		obj = new GenerateSubString();
	}
	
	@Test
    public void testGenerateSubString(){
		obj.generateSubString("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
	}
	

}
