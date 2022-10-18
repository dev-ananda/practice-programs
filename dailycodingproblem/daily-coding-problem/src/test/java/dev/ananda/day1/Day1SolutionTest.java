package dev.ananda.day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1SolutionTest {

    Day1Solution solution = new Day1Solution();

    @Test
    public void testSolution_Success() {
        int[] arr = {15, 32, 50, 27};
        int sum = 65;

        System.out.println( "Input array is " + Arrays.stream(arr).boxed().collect( Collectors.toList() ) + ", sum = " + sum );
        String expected = "Values make up sum are 15, 50";
        String actual = solution.findPairForSumInArray(arr, sum);

        assertEquals(expected, actual, "Solution is not working as expected");
    }

}
