package dev.ananda.dsa.dp.childjump;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildJumpTest {

    @Test
    public void testBoundary1(){
        assertEquals(1, ChildJump.noOfWaysToReach(1));
    }

    @Test
    public void testBoundary2(){
        assertEquals(2, ChildJump.noOfWaysToReach(2));
    }

    @Test
    public void testBoundary3(){
        assertEquals(4, ChildJump.noOfWaysToReach(3));
    }

    @Test
    public void testBoundary4(){
        assertEquals(7, ChildJump.noOfWaysToReach(4));
    }

    @Test
    public void testBoundary5(){
        assertEquals(13, ChildJump.noOfWaysToReach(5));
    }

    @Test
    public void testBoundary6(){
        assertEquals(24, ChildJump.noOfWaysToReach(6));
    }

    @Test
    public void testBoundary7(){
        assertEquals(44, ChildJump.noOfWaysToReach(7));
    }

    @Test
    public void testBoundary8(){
        assertEquals(81, ChildJump.noOfWaysToReach(8));
    }

    @Test
    public void testBoundary9(){
        assertEquals(149, ChildJump.noOfWaysToReach(9));
    }

    @Test
    public void testBoundary30(){
        assertEquals(53798080, ChildJump.noOfWaysToReach(30));
    }

    @Test
    public void testBoundary40(){
        assertEquals(86212607, ChildJump.noOfWaysToReach(40));
    }

}
