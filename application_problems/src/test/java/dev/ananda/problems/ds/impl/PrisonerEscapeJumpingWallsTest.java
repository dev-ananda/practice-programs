
/**
 * @author Ananda
 *
 */
package dev.ananda.problems.ds.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrisonerEscapeJumpingWallsTest {
	PrisonerEscapeJumpingWalls prisonerEsacaper;
	
	@Before
	public void initialize(){
		prisonerEsacaper = new PrisonerEscapeJumpingWalls();
	}
	
	@Test
	public void testCalculateNoOfJumps(){
		int [] walls = {5, 9, 16, 23};
		int jumpCapacity = 5;
		int slippery = 1;
		
		assertEquals(prisonerEsacaper.calculateNoOfJumps(walls, jumpCapacity, slippery),13);
	}
}
