package dev.ananda.dsa.dp.fibonacci;

import org.junit.*;
import static org.junit.Assert.*;


public class FibonacciTest {

    @Test
    public void testBoundary0(){
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testBoundary1(){
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testBoundary100(){
        assertEquals(196418, Fibonacci.fibonacci(27));
    }



}
