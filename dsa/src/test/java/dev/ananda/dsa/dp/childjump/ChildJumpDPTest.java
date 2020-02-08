package dev.ananda.dsa.dp.childjump;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildJumpDPTest {

    @Test
    public void testBoundary1(){
        assertEquals(1, ChildJumpDP.noOfWaysToReach(1));
    }

    @Test
    public void testBoundary2(){
        assertEquals(2, ChildJumpDP.noOfWaysToReach(2));
    }

    @Test
    public void testBoundary3(){
        assertEquals(4, ChildJumpDP.noOfWaysToReach(3));
    }

    @Test
    public void testBoundary5(){
        assertEquals(13, ChildJumpDP.noOfWaysToReach(5));
    }

    @Test
    public void testBoundary9(){
        assertEquals(149, ChildJumpDP.noOfWaysToReach(9));
    }

    @Test
    public void testBoundary30(){
        assertEquals(53798080, ChildJumpDP.noOfWaysToReach(30));
    }

    @Test
    public void testBoundary60(){
        assertEquals(86212607, ChildJumpDP.noOfWaysToReach(60));
    }
}
