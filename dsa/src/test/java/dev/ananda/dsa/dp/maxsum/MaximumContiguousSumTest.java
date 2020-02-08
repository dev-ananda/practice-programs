package dev.ananda.dsa.dp.maxsum;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumContiguousSumTest {

    private MaximumContiguousSum contiguousSumComputer;

    @Before
    public void setUp() throws Exception {
        int[] elems = {5, -3, -1, -6, 11, -4, 13, -5, 2};
        contiguousSumComputer = new MaximumContiguousSum(elems);
    }

    @Test
    public void testComputeMaxSum() {
        MaximumContiguousSum.Result result = contiguousSumComputer.findMaxContiguousSum();
        assertEquals(4, result.getStartIndex());
        assertEquals(6, result.getMaxIndex());
        assertEquals(20, result.getMaxSum());

    }

}
