package dev.ananda.dsa.dp.childjump;

/*
Problem definition

A child can jump atmost 3 steps at a time. Child can jump 1 step or 2steps or 3 steps.
How many different ways can the child reach top of n steps

Solution

Induction method

Jump (n) = Jump (n-1) + Jump (n-2) + Jump (n-3)

Child can reach Nth step from (N-1)th step or (N-2)th step or (N-3)th step

Jump (n) =  | 1         when n = 0
            | 1         when n = 1
            | 2         when n = 2
            | Jump (n-1) + Jump (n-2) + Jump (n-3)      when n > 2
*/

public class ChildJumpDP {
    private static int [] jumps;
    static {
        jumps = new int[150];
    }

    public static int noOfWaysToReach(int n){
        if(0 == n){
            return 1;
        }
        if(1 == n){
            return 1;
        }
        if(2 == n){
            return 2;
        }
        if(0 != jumps[n]){
            return jumps[n];
        }
        jumps[n] = noOfWaysToReach(n-1) + noOfWaysToReach(n-2) + noOfWaysToReach(n-3);
        return jumps[n];
    }

}
