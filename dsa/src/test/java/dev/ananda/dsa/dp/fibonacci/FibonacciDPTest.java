package dev.ananda.dsa.dp.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciDPTest {

    private FibonacciDP fib;

    @Before
    public void setUp() throws Exception {
        fib = new FibonacciDP();
    }

    @Test
    public void testBoundary0(){
        assertEquals(0, fib.fibonacci(0));
    }

    @Test
    public void testBoundary1(){
        assertEquals(1, fib.fibonacci(1));
    }

    @Test
    public void testBoundary100(){
        assertEquals(196418, fib.fibonacci(27));
    }
}
