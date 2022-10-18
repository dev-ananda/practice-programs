package dev.ananda.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Day1Solution {
    /**
     *
     * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
     *
     * For example, given [15, 32, 50, 27] and k of 65, return true since 15 + 50 is 65.
     *
     * Bonus: Can you do this in one pass?
     */

    public String findPairForSumInArray( int[] arr, int sum ) {
        if( null== arr || arr.length == 0 ) {
            throw new RuntimeException( "Invalid input" );
        }

        StringBuilder response = new StringBuilder();
        Set<Integer> values = new HashSet<>(arr.length);
        for( int elem: arr ) {
            if( values.contains( sum-elem ) ) {
                response.append( "Values make up sum are ").append( sum-elem ).append(", " ).append( elem );
                break;
            }
            values.add( elem);
        }
        if( response.length() == 0 ) {
            response.append( "Couldn't find the values to make up sum value " ).append(sum);
        }
        return response.toString();
    }
}
