package dev.ananda.ds.impl;

public class PrisonerEscapeJumpingWalls {

    /*
     * To design a program to calculate no of jumps required by a prisoner to escape from jail with the following conditions
     *
     * Prisoner can jump jumpCapacity units.
     *
     * if the wall is more height than his capacity then he slips by slippery units before next jump till he complete jumping the wall
     *
     */

    public static int calculateNoOfJumps(int[] wallHeights, int jumpCapacity, int slippery) {
        int totalNoOfJumps = 0;
        for (int i = 0; i < wallHeights.length; i++) {
            int wallHeight = wallHeights[i];
            boolean jumping = true;
            while (jumping) {
                totalNoOfJumps++;
                if (wallHeight <= jumpCapacity) {
                    jumping = false;
                } else {
                    wallHeight -= (jumpCapacity - slippery);
                }
            }
        }
        return totalNoOfJumps;
    }

}
