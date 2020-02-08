package dev.ananda.dsa.dp.maxflowmatrix;

import dev.ananda.dsa.linkedlist.LinkedList;
import org.junit.Before;
import org.junit.Test;

public class MaxFlowJourneyInMatrixTest {

    private MaxFlowJourneyInMatrix journeyInMatrix;

    @Before
    public void setUp() throws Exception {

        int [][] a = {
                {1, 0, 2, 4},
                {3, 7, 1, 6},
                {5, 8, 11, 6},
                {4, 12, 2, 1}
        };

        journeyInMatrix = new MaxFlowJourneyInMatrix(a, 4, 4);
    }

    @Test
    public void testPath(){
        LinkedList<MaxFlowJourneyInMatrix.Position> path = journeyInMatrix.getPath();
        for (MaxFlowJourneyInMatrix.Position pos: path){
            System.out.println(pos);
        }
    }

}
