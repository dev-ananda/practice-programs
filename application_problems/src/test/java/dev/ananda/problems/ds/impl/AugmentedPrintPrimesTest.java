/**
 * @author Ananda
 *
 */
package dev.ananda.problems.ds.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AugmentedPrintPrimesTest {
	
	AugmentedPrintPrimes primeMethods;
	
	@Before
	public void prepareInputData(){
		primeMethods = new AugmentedPrintPrimes();
	}
	
	@Test
	public void testPrintPrimes(){
		
		for(int i=2; i<=50;i++){
			int noOfPrimes = i;
			System.out.println("N = "+noOfPrimes);
			int iterations1 = primeMethods.printPrimes(noOfPrimes);
			System.out.println("No of iterations = "+iterations1);
			System.out.println();
			int iterations2 = primeMethods.printPrimesOptimized(noOfPrimes);
			System.out.println("No of iterations = "+iterations2);
			double percentage = (0.0 + iterations2)/iterations1;
			System.out.println("% time taken by the AUGMENTED METHOD =" + percentage*100 );
			System.out.println();
		}
		assertTrue(true);
		
	}
}
